package game.com.sudoku.query;

public class AddValueInSudokuQueryConstant {

	public AddValueInSudokuQueryConstant() {
	}
	
	public static final String ADD_VALUE="UPDATE sudoku_matrix SET row_?_col_? = ? , missing_digits = ? WHERE matrix_id=?";

}
