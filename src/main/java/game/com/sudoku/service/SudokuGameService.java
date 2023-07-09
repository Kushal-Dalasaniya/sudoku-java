package game.com.sudoku.service;

import org.springframework.stereotype.Service;

import game.com.sudoku.model.InsertDataInMatrix;
import game.com.sudoku.model.SudokuGameMatrix;

@Service
public interface SudokuGameService {
	/*
	 * start sudoku game
	 * @Param correlationId
	 */
	SudokuGameMatrix startSudokuGame(String correlationId);
	
	/*
	 * Add value sudoku matrix
	 * @Param correlationId
	 * @Param matrixId
	 */
	SudokuGameMatrix addValueInSudoku(String correlationId,Integer matrixId,InsertDataInMatrix body) throws InterruptedException; 
	
	/*
	 * Get sudoku Matrix 
	 * @Param correlationId
	 * @Param matrixId
	 */
	SudokuGameMatrix getSudokuMatrix(Integer matrixId,String correlationId);
	
	/*
	 * Get new sudoku  
	 * @Param correlationId
	 */
	SudokuGameMatrix newSudokuGame(String correlationId);
}
