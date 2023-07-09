package game.com.sudoku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import game.com.sudoku.entity.SudokuMatrix;
import game.com.sudoku.exception.SudokuGameException;
import game.com.sudoku.model.InsertDataInMatrix;
import game.com.sudoku.model.SudokuGameMatrix;
import game.com.sudoku.repository.SudokuJdbcRepository;
import game.com.sudoku.repository.SudokuRepository;
import game.com.sudoku.util.Converssion;
import game.com.sudoku.util.SudokuGameConstants;
import game.com.sudoku.util.SudokuGameExceptionConstants;
import game.com.sudoku.util.SudokuGenerator;

@Service
public class SudokuGameServiceImpl implements SudokuGameService {
	@Autowired
	SudokuRepository sudokuRepository;
	
	@Autowired
	SudokuJdbcRepository sudokuJdbcRepository;
	
	@Autowired
	private Environment env;

	@Override
	public SudokuGameMatrix startSudokuGame(String correlationId) {
		List<SudokuMatrix> sudokuMatrix = sudokuRepository.findByCurrentGame('Y');
		return new SudokuGameMatrix().matrix(Converssion.entityToMatrix(sudokuMatrix.get(0))).matrixId(sudokuMatrix.get(0).getMatrix_id()).missingDigits(sudokuMatrix.get(0).getMissing_digits());
	}

	@Override
	public SudokuGameMatrix getSudokuMatrix(Integer matrixId, String correlationId) {
		SudokuMatrix sudokuMatrix = sudokuRepository.getById(matrixId);
		return new SudokuGameMatrix().matrix(Converssion.entityToMatrix(sudokuMatrix)).matrixId(matrixId).missingDigits(sudokuMatrix.getMissing_digits());
	}

	@Override
	public SudokuGameMatrix addValueInSudoku(String correlationId, Integer matrixId, InsertDataInMatrix body) throws InterruptedException {
		SudokuMatrix sudokuMatrix = sudokuRepository.getById(matrixId);
		List<List<Integer>> matrix = Converssion.entityToMatrix(sudokuMatrix);
		Integer missingDigit = sudokuMatrix.getMissing_digits();
		if(body.getValue()==0 || validValue(matrix,body.getRow()-1,body.getColumn()-1,body.getValue())) {
			if(matrix.get(body.getRow()-1).get(body.getColumn()-1)!=body.getValue()) {
				missingDigit = missingDigit - (body.getValue()!=0 && matrix.get(body.getRow()-1).get(body.getColumn()-1) != 0 ?  0 : (body.getValue()==0 ? -1 : 1 ));
				sudokuJdbcRepository.addValueInSudoku(correlationId, matrixId, body,missingDigit);
			}
		}
		else {
			String exMessage= String.format(env.getRequiredProperty(SudokuGameExceptionConstants.SUDOKU_INVALID_NUMBER), body.getValue());
			throw new SudokuGameException(HttpStatus.BAD_REQUEST, SudokuGameExceptionConstants.SUDOKU_INVALID_NUMBER,exMessage, correlationId);
		}
		matrix.get(body.getRow()-1).set(body.getColumn()-1,body.getValue()); 
		return new SudokuGameMatrix().matrix(matrix).matrixId(matrixId).missingDigits(missingDigit);
	}
	
	private boolean validValue(List<List<Integer>>board,Integer i,Integer j,Integer val){
        for(int col=0;col<9;col++)
            if(board.get(i).get(col)!=null && board.get(i).get(col).equals(val)) return false;
        
        for(int row=0;row<9;row++)
            if(board.get(row).get(j)!=null && board.get(row).get(j).equals(val)) return false;
        
        int row=(i/3)*3;
        int col=(j/3)*3;
        
        for(int m=row;m<row+3;m++)
            for(int n=col;n<col+3;n++)
                if(board.get(m).get(n)!=null && board.get(m).get(n).equals(val)) return false;
            
        return true;
    }

	@Override
	public SudokuGameMatrix newSudokuGame(String correlationId) {
		SudokuMatrix sudokuMatrix = sudokuRepository.findByCurrentGame('Y').get(0);
		sudokuMatrix.setCurrent_game('N');
		sudokuRepository.saveAndFlush(sudokuMatrix);
		
		Integer missingDigits = (int)Math.floor(Math.random() * (SudokuGameConstants.MISSING_DIGITS_UPPER_BOUND - SudokuGameConstants.MISSING_DIGITS_LOWER_BOUND + 1) + SudokuGameConstants.MISSING_DIGITS_LOWER_BOUND);
		
		SudokuGenerator sg = new SudokuGenerator(missingDigits);
		int[] mat[] = sg.fillValues();
		sg.printSudoku();
		
		SudokuMatrix newSudokuMatrix= Converssion.arrayToEntity(mat);
		newSudokuMatrix.setCurrent_game('Y');
		newSudokuMatrix.setMissing_digits(missingDigits);
		SudokuMatrix sm = sudokuRepository.saveAndFlush(newSudokuMatrix);
		
		return new SudokuGameMatrix().matrix(Converssion.entityToMatrix(sm)).matrixId(sm.getMatrix_id()).missingDigits(sm.getMissing_digits());
	}
	
	

}
