package game.com.sudoku.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import game.com.sudoku.entity.SudokuMatrix;

public class Converssion {

	public static List<List<Integer>> entityToMatrix(SudokuMatrix mat){
		
		List<Integer> row1 = new ArrayList<>(Arrays.asList(mat.getRow_1_col_1(),mat.getRow_1_col_2(),mat.getRow_1_col_3(),mat.getRow_1_col_4(),
				mat.getRow_1_col_5(),mat.getRow_1_col_6(),mat.getRow_1_col_7(),mat.getRow_1_col_8(),mat.getRow_1_col_9()));
		List<Integer> row2 = new ArrayList<>(Arrays.asList(mat.getRow_2_col_1(),mat.getRow_2_col_2(),mat.getRow_2_col_3(),mat.getRow_2_col_4(),
				mat.getRow_2_col_5(),mat.getRow_2_col_6(),mat.getRow_2_col_7(),mat.getRow_2_col_8(),mat.getRow_2_col_9()));
		List<Integer> row3 = new ArrayList<>(Arrays.asList(mat.getRow_3_col_1(),mat.getRow_3_col_2(),mat.getRow_3_col_3(),mat.getRow_3_col_4(),
				mat.getRow_3_col_5(),mat.getRow_3_col_6(),mat.getRow_3_col_7(),mat.getRow_3_col_8(),mat.getRow_3_col_9()));
		List<Integer> row4 = new ArrayList<>(Arrays.asList(mat.getRow_4_col_1(),mat.getRow_4_col_2(),mat.getRow_4_col_3(),mat.getRow_4_col_4(),
				mat.getRow_4_col_5(),mat.getRow_4_col_6(),mat.getRow_4_col_7(),mat.getRow_4_col_8(),mat.getRow_4_col_9()));
		List<Integer> row5 = new ArrayList<>(Arrays.asList(mat.getRow_5_col_1(),mat.getRow_5_col_2(),mat.getRow_5_col_3(),mat.getRow_5_col_4(),
				mat.getRow_5_col_5(),mat.getRow_5_col_6(),mat.getRow_5_col_7(),mat.getRow_5_col_8(),mat.getRow_5_col_9()));
		List<Integer> row6 = new ArrayList<>(Arrays.asList(mat.getRow_6_col_1(),mat.getRow_6_col_2(),mat.getRow_6_col_3(),mat.getRow_6_col_4(),
				mat.getRow_6_col_5(),mat.getRow_6_col_6(),mat.getRow_6_col_7(),mat.getRow_6_col_8(),mat.getRow_6_col_9()));
		List<Integer> row7 = new ArrayList<>(Arrays.asList(mat.getRow_7_col_1(),mat.getRow_7_col_2(),mat.getRow_7_col_3(),mat.getRow_7_col_4(),
				mat.getRow_7_col_5(),mat.getRow_7_col_6(),mat.getRow_7_col_7(),mat.getRow_7_col_8(),mat.getRow_7_col_9()));
		List<Integer> row8 = new ArrayList<>(Arrays.asList(mat.getRow_8_col_1(),mat.getRow_8_col_2(),mat.getRow_8_col_3(),mat.getRow_8_col_4(),
				mat.getRow_8_col_5(),mat.getRow_8_col_6(),mat.getRow_8_col_7(),mat.getRow_8_col_8(),mat.getRow_8_col_9()));
		List<Integer> row9 = new ArrayList<>(Arrays.asList(mat.getRow_9_col_1(),mat.getRow_9_col_2(),mat.getRow_9_col_3(),mat.getRow_9_col_4(),
				mat.getRow_9_col_5(),mat.getRow_9_col_6(),mat.getRow_9_col_7(),mat.getRow_9_col_8(),mat.getRow_9_col_9()));
		
		return new ArrayList<>(Arrays.asList(row1,row2,row3,row4,row5,row6,row7,row8,row9));
	}
	
	
	public static SudokuMatrix arrayToEntity(int[] mat[]) {
		SudokuMatrix sudokuMat = new SudokuMatrix();
		sudokuMat.setRow_1_col_1(mat[0][0]);
		sudokuMat.setRow_1_col_2(mat[0][1]);
		sudokuMat.setRow_1_col_3(mat[0][2]);
		sudokuMat.setRow_1_col_4(mat[0][3]);
		sudokuMat.setRow_1_col_5(mat[0][4]);
		sudokuMat.setRow_1_col_6(mat[0][5]);
		sudokuMat.setRow_1_col_7(mat[0][6]);
		sudokuMat.setRow_1_col_8(mat[0][7]);
		sudokuMat.setRow_1_col_9(mat[0][8]);
		
		sudokuMat.setRow_2_col_1(mat[1][0]);
		sudokuMat.setRow_2_col_2(mat[1][1]);
		sudokuMat.setRow_2_col_3(mat[1][2]);
		sudokuMat.setRow_2_col_4(mat[1][3]);
		sudokuMat.setRow_2_col_5(mat[1][4]);
		sudokuMat.setRow_2_col_6(mat[1][5]);
		sudokuMat.setRow_2_col_7(mat[1][6]);
		sudokuMat.setRow_2_col_8(mat[1][7]);
		sudokuMat.setRow_2_col_9(mat[1][8]);
		
		sudokuMat.setRow_3_col_1(mat[2][0]);
		sudokuMat.setRow_3_col_2(mat[2][1]);
		sudokuMat.setRow_3_col_3(mat[2][2]);
		sudokuMat.setRow_3_col_4(mat[2][3]);
		sudokuMat.setRow_3_col_5(mat[2][4]);
		sudokuMat.setRow_3_col_6(mat[2][5]);
		sudokuMat.setRow_3_col_7(mat[2][6]);
		sudokuMat.setRow_3_col_8(mat[2][7]);
		sudokuMat.setRow_3_col_9(mat[2][8]);
		
	    sudokuMat.setRow_4_col_1(mat[3][0]);
		sudokuMat.setRow_4_col_2(mat[3][1]);
		sudokuMat.setRow_4_col_3(mat[3][2]);
		sudokuMat.setRow_4_col_4(mat[3][3]);
		sudokuMat.setRow_4_col_5(mat[3][4]);
		sudokuMat.setRow_4_col_6(mat[3][5]);
		sudokuMat.setRow_4_col_7(mat[3][6]);
		sudokuMat.setRow_4_col_8(mat[3][7]);
		sudokuMat.setRow_4_col_9(mat[3][8]);
		
        sudokuMat.setRow_5_col_1(mat[4][0]);
		sudokuMat.setRow_5_col_2(mat[4][1]);
		sudokuMat.setRow_5_col_3(mat[4][2]);
		sudokuMat.setRow_5_col_4(mat[4][3]);
		sudokuMat.setRow_5_col_5(mat[4][4]);
		sudokuMat.setRow_5_col_6(mat[4][5]);
		sudokuMat.setRow_5_col_7(mat[4][6]);
		sudokuMat.setRow_5_col_8(mat[4][7]);
		sudokuMat.setRow_5_col_9(mat[4][8]);
		
		sudokuMat.setRow_6_col_1(mat[5][0]);
		sudokuMat.setRow_6_col_2(mat[5][1]);
		sudokuMat.setRow_6_col_3(mat[5][2]);
		sudokuMat.setRow_6_col_4(mat[5][3]);
		sudokuMat.setRow_6_col_5(mat[5][4]);
		sudokuMat.setRow_6_col_6(mat[5][5]);
		sudokuMat.setRow_6_col_7(mat[5][6]);
		sudokuMat.setRow_6_col_8(mat[5][7]);
		sudokuMat.setRow_6_col_9(mat[5][8]);
		
		sudokuMat.setRow_7_col_1(mat[6][0]);
		sudokuMat.setRow_7_col_2(mat[6][1]);
		sudokuMat.setRow_7_col_3(mat[6][2]);
		sudokuMat.setRow_7_col_4(mat[6][3]);
		sudokuMat.setRow_7_col_5(mat[6][4]);
		sudokuMat.setRow_7_col_6(mat[6][5]);
		sudokuMat.setRow_7_col_7(mat[6][6]);
		sudokuMat.setRow_7_col_8(mat[6][7]);
		sudokuMat.setRow_7_col_9(mat[6][8]);
		
        sudokuMat.setRow_8_col_1(mat[7][0]);
		sudokuMat.setRow_8_col_2(mat[7][1]);
		sudokuMat.setRow_8_col_3(mat[7][2]);
		sudokuMat.setRow_8_col_4(mat[7][3]);
		sudokuMat.setRow_8_col_5(mat[7][4]);
		sudokuMat.setRow_8_col_6(mat[7][5]);
		sudokuMat.setRow_8_col_7(mat[7][6]);
		sudokuMat.setRow_8_col_8(mat[7][7]);
		sudokuMat.setRow_8_col_9(mat[7][8]);
		
		sudokuMat.setRow_9_col_1(mat[8][0]);
		sudokuMat.setRow_9_col_2(mat[8][1]);
		sudokuMat.setRow_9_col_3(mat[8][2]);
		sudokuMat.setRow_9_col_4(mat[8][3]);
		sudokuMat.setRow_9_col_5(mat[8][4]);
		sudokuMat.setRow_9_col_6(mat[8][5]);
		sudokuMat.setRow_9_col_7(mat[8][6]);
		sudokuMat.setRow_9_col_8(mat[8][7]);
		sudokuMat.setRow_9_col_9(mat[8][8]);
		
		return sudokuMat;
	}

}
