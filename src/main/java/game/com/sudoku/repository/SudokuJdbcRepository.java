package game.com.sudoku.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import game.com.sudoku.model.InsertDataInMatrix;
import game.com.sudoku.query.AddValueInSudokuQueryConstant;

@Repository
public class SudokuJdbcRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addValueInSudoku(String correlationId, Integer matrixId, InsertDataInMatrix data,Integer missingDigit) throws InterruptedException {
		String sql = AddValueInSudokuQueryConstant.ADD_VALUE;
		Object arg[] = new Object[] {data.getRow(),data.getColumn(),data.getValue(),missingDigit,matrixId};
		int res = jdbcTemplate.update(sql, arg);
		System.out.println("update matrix : "+ res);
	}

}
