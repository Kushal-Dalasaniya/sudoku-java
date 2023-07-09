package game.com.sudoku.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="sudoku_matrix")
public class SudokuMatrix {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer matrix_id;
	  private Integer row_1_col_1; 
	  private Integer row_1_col_2; 
	  private Integer row_1_col_3; 
	  private Integer row_1_col_4; 
	  private Integer row_1_col_5; 
	  private Integer row_1_col_6; 
	  private Integer row_1_col_7; 
	  private Integer row_1_col_8; 
	  private Integer row_1_col_9; 
	  private Integer row_2_col_1; 
	  private Integer row_2_col_2; 
	  private Integer row_2_col_3; 
	  private Integer row_2_col_4; 
	  private Integer row_2_col_5; 
	  private Integer row_2_col_6; 
	  private Integer row_2_col_7; 
	  private Integer row_2_col_8; 
	  private Integer row_2_col_9; 
	  private Integer row_3_col_1; 
	  private Integer row_3_col_2; 
	  private Integer row_3_col_3; 
	  private Integer row_3_col_4; 
	  private Integer row_3_col_5; 
	  private Integer row_3_col_6; 
	  private Integer row_3_col_7; 
	  private Integer row_3_col_8; 
	  private Integer row_3_col_9; 
	  private Integer row_4_col_1; 
	  private Integer row_4_col_2; 
	  private Integer row_4_col_3; 
	  private Integer row_4_col_4; 
	  private Integer row_4_col_5; 
	  private Integer row_4_col_6; 
	  private Integer row_4_col_7; 
	  private Integer row_4_col_8; 
	  private Integer row_4_col_9; 
	  private Integer row_5_col_1; 
	  private Integer row_5_col_2; 
	  private Integer row_5_col_3; 
	  private Integer row_5_col_4; 
	  private Integer row_5_col_5; 
	  private Integer row_5_col_6; 
	  private Integer row_5_col_7; 
	  private Integer row_5_col_8; 
	  private Integer row_5_col_9; 
	  private Integer row_6_col_1; 
	  private Integer row_6_col_2; 
	  private Integer row_6_col_3; 
	  private Integer row_6_col_4; 
	  private Integer row_6_col_5; 
	  private Integer row_6_col_6; 
	  private Integer row_6_col_7; 
	  private Integer row_6_col_8; 
	  private Integer row_6_col_9; 
	  private Integer row_7_col_1; 
	  private Integer row_7_col_2; 
	  private Integer row_7_col_3; 
	  private Integer row_7_col_4; 
	  private Integer row_7_col_5; 
	  private Integer row_7_col_6; 
	  private Integer row_7_col_7; 
	  private Integer row_7_col_8; 
	  private Integer row_7_col_9; 
	  private Integer row_8_col_1; 
	  private Integer row_8_col_2; 
	  private Integer row_8_col_3; 
	  private Integer row_8_col_4; 
	  private Integer row_8_col_5; 
	  private Integer row_8_col_6; 
	  private Integer row_8_col_7; 
	  private Integer row_8_col_8; 
	  private Integer row_8_col_9; 
	  private Integer row_9_col_1; 
	  private Integer row_9_col_2; 
	  private Integer row_9_col_3; 
	  private Integer row_9_col_4; 
	  private Integer row_9_col_5; 
	  private Integer row_9_col_6; 
	  private Integer row_9_col_7; 
	  private Integer row_9_col_8; 
	  private Integer row_9_col_9;
	  private Character current_game;
	  private Integer missing_digits;
	
	public Integer getMatrix_id() {
		return matrix_id;
	}
	public void setMatrix_id(Integer matrix_id) {
		this.matrix_id = matrix_id;
	}
	public Integer getRow_1_col_1() {
		return row_1_col_1;
	}
	public void setRow_1_col_1(Integer row_1_col_1) {
		this.row_1_col_1 = row_1_col_1;
	}
	public Integer getRow_1_col_2() {
		return row_1_col_2;
	}
	public void setRow_1_col_2(Integer row_1_col_2) {
		this.row_1_col_2 = row_1_col_2;
	}
	public Integer getRow_1_col_3() {
		return row_1_col_3;
	}
	public void setRow_1_col_3(Integer row_1_col_3) {
		this.row_1_col_3 = row_1_col_3;
	}
	public Integer getRow_1_col_4() {
		return row_1_col_4;
	}
	public void setRow_1_col_4(Integer row_1_col_4) {
		this.row_1_col_4 = row_1_col_4;
	}
	public Integer getRow_1_col_5() {
		return row_1_col_5;
	}
	public void setRow_1_col_5(Integer row_1_col_5) {
		this.row_1_col_5 = row_1_col_5;
	}
	public Integer getRow_1_col_6() {
		return row_1_col_6;
	}
	public void setRow_1_col_6(Integer row_1_col_6) {
		this.row_1_col_6 = row_1_col_6;
	}
	public Integer getRow_1_col_7() {
		return row_1_col_7;
	}
	public void setRow_1_col_7(Integer row_1_col_7) {
		this.row_1_col_7 = row_1_col_7;
	}
	public Integer getRow_1_col_8() {
		return row_1_col_8;
	}
	public void setRow_1_col_8(Integer row_1_col_8) {
		this.row_1_col_8 = row_1_col_8;
	}
	public Integer getRow_1_col_9() {
		return row_1_col_9;
	}
	public void setRow_1_col_9(Integer row_1_col_9) {
		this.row_1_col_9 = row_1_col_9;
	}
	public Integer getRow_2_col_1() {
		return row_2_col_1;
	}
	public void setRow_2_col_1(Integer row_2_col_1) {
		this.row_2_col_1 = row_2_col_1;
	}
	public Integer getRow_2_col_2() {
		return row_2_col_2;
	}
	public void setRow_2_col_2(Integer row_2_col_2) {
		this.row_2_col_2 = row_2_col_2;
	}
	public Integer getRow_2_col_3() {
		return row_2_col_3;
	}
	public void setRow_2_col_3(Integer row_2_col_3) {
		this.row_2_col_3 = row_2_col_3;
	}
	public Integer getRow_2_col_4() {
		return row_2_col_4;
	}
	public void setRow_2_col_4(Integer row_2_col_4) {
		this.row_2_col_4 = row_2_col_4;
	}
	public Integer getRow_2_col_5() {
		return row_2_col_5;
	}
	public void setRow_2_col_5(Integer row_2_col_5) {
		this.row_2_col_5 = row_2_col_5;
	}
	public Integer getRow_2_col_6() {
		return row_2_col_6;
	}
	public void setRow_2_col_6(Integer row_2_col_6) {
		this.row_2_col_6 = row_2_col_6;
	}
	public Integer getRow_2_col_7() {
		return row_2_col_7;
	}
	public void setRow_2_col_7(Integer row_2_col_7) {
		this.row_2_col_7 = row_2_col_7;
	}
	public Integer getRow_2_col_8() {
		return row_2_col_8;
	}
	public void setRow_2_col_8(Integer row_2_col_8) {
		this.row_2_col_8 = row_2_col_8;
	}
	public Integer getRow_2_col_9() {
		return row_2_col_9;
	}
	public void setRow_2_col_9(Integer row_2_col_9) {
		this.row_2_col_9 = row_2_col_9;
	}
	public Integer getRow_3_col_1() {
		return row_3_col_1;
	}
	public void setRow_3_col_1(Integer row_3_col_1) {
		this.row_3_col_1 = row_3_col_1;
	}
	public Integer getRow_3_col_2() {
		return row_3_col_2;
	}
	public void setRow_3_col_2(Integer row_3_col_2) {
		this.row_3_col_2 = row_3_col_2;
	}
	public Integer getRow_3_col_3() {
		return row_3_col_3;
	}
	public void setRow_3_col_3(Integer row_3_col_3) {
		this.row_3_col_3 = row_3_col_3;
	}
	public Integer getRow_3_col_4() {
		return row_3_col_4;
	}
	public void setRow_3_col_4(Integer row_3_col_4) {
		this.row_3_col_4 = row_3_col_4;
	}
	public Integer getRow_3_col_5() {
		return row_3_col_5;
	}
	public void setRow_3_col_5(Integer row_3_col_5) {
		this.row_3_col_5 = row_3_col_5;
	}
	public Integer getRow_3_col_6() {
		return row_3_col_6;
	}
	public void setRow_3_col_6(Integer row_3_col_6) {
		this.row_3_col_6 = row_3_col_6;
	}
	public Integer getRow_3_col_7() {
		return row_3_col_7;
	}
	public void setRow_3_col_7(Integer row_3_col_7) {
		this.row_3_col_7 = row_3_col_7;
	}
	public Integer getRow_3_col_8() {
		return row_3_col_8;
	}
	public void setRow_3_col_8(Integer row_3_col_8) {
		this.row_3_col_8 = row_3_col_8;
	}
	public Integer getRow_3_col_9() {
		return row_3_col_9;
	}
	public void setRow_3_col_9(Integer row_3_col_9) {
		this.row_3_col_9 = row_3_col_9;
	}
	public Integer getRow_4_col_1() {
		return row_4_col_1;
	}
	public void setRow_4_col_1(Integer row_4_col_1) {
		this.row_4_col_1 = row_4_col_1;
	}
	public Integer getRow_4_col_2() {
		return row_4_col_2;
	}
	public void setRow_4_col_2(Integer row_4_col_2) {
		this.row_4_col_2 = row_4_col_2;
	}
	public Integer getRow_4_col_3() {
		return row_4_col_3;
	}
	public void setRow_4_col_3(Integer row_4_col_3) {
		this.row_4_col_3 = row_4_col_3;
	}
	public Integer getRow_4_col_4() {
		return row_4_col_4;
	}
	public void setRow_4_col_4(Integer row_4_col_4) {
		this.row_4_col_4 = row_4_col_4;
	}
	public Integer getRow_4_col_5() {
		return row_4_col_5;
	}
	public void setRow_4_col_5(Integer row_4_col_5) {
		this.row_4_col_5 = row_4_col_5;
	}
	public Integer getRow_4_col_6() {
		return row_4_col_6;
	}
	public void setRow_4_col_6(Integer row_4_col_6) {
		this.row_4_col_6 = row_4_col_6;
	}
	public Integer getRow_4_col_7() {
		return row_4_col_7;
	}
	public void setRow_4_col_7(Integer row_4_col_7) {
		this.row_4_col_7 = row_4_col_7;
	}
	public Integer getRow_4_col_8() {
		return row_4_col_8;
	}
	public void setRow_4_col_8(Integer row_4_col_8) {
		this.row_4_col_8 = row_4_col_8;
	}
	public Integer getRow_4_col_9() {
		return row_4_col_9;
	}
	public void setRow_4_col_9(Integer row_4_col_9) {
		this.row_4_col_9 = row_4_col_9;
	}
	public Integer getRow_5_col_1() {
		return row_5_col_1;
	}
	public void setRow_5_col_1(Integer row_5_col_1) {
		this.row_5_col_1 = row_5_col_1;
	}
	public Integer getRow_5_col_2() {
		return row_5_col_2;
	}
	public void setRow_5_col_2(Integer row_5_col_2) {
		this.row_5_col_2 = row_5_col_2;
	}
	public Integer getRow_5_col_3() {
		return row_5_col_3;
	}
	public void setRow_5_col_3(Integer row_5_col_3) {
		this.row_5_col_3 = row_5_col_3;
	}
	public Integer getRow_5_col_4() {
		return row_5_col_4;
	}
	public void setRow_5_col_4(Integer row_5_col_4) {
		this.row_5_col_4 = row_5_col_4;
	}
	public Integer getRow_5_col_5() {
		return row_5_col_5;
	}
	public void setRow_5_col_5(Integer row_5_col_5) {
		this.row_5_col_5 = row_5_col_5;
	}
	public Integer getRow_5_col_6() {
		return row_5_col_6;
	}
	public void setRow_5_col_6(Integer row_5_col_6) {
		this.row_5_col_6 = row_5_col_6;
	}
	public Integer getRow_5_col_7() {
		return row_5_col_7;
	}
	public void setRow_5_col_7(Integer row_5_col_7) {
		this.row_5_col_7 = row_5_col_7;
	}
	public Integer getRow_5_col_8() {
		return row_5_col_8;
	}
	public void setRow_5_col_8(Integer row_5_col_8) {
		this.row_5_col_8 = row_5_col_8;
	}
	public Integer getRow_5_col_9() {
		return row_5_col_9;
	}
	public void setRow_5_col_9(Integer row_5_col_9) {
		this.row_5_col_9 = row_5_col_9;
	}
	public Integer getRow_6_col_1() {
		return row_6_col_1;
	}
	public void setRow_6_col_1(Integer row_6_col_1) {
		this.row_6_col_1 = row_6_col_1;
	}
	public Integer getRow_6_col_2() {
		return row_6_col_2;
	}
	public void setRow_6_col_2(Integer row_6_col_2) {
		this.row_6_col_2 = row_6_col_2;
	}
	public Integer getRow_6_col_3() {
		return row_6_col_3;
	}
	public void setRow_6_col_3(Integer row_6_col_3) {
		this.row_6_col_3 = row_6_col_3;
	}
	public Integer getRow_6_col_4() {
		return row_6_col_4;
	}
	public void setRow_6_col_4(Integer row_6_col_4) {
		this.row_6_col_4 = row_6_col_4;
	}
	public Integer getRow_6_col_5() {
		return row_6_col_5;
	}
	public void setRow_6_col_5(Integer row_6_col_5) {
		this.row_6_col_5 = row_6_col_5;
	}
	public Integer getRow_6_col_6() {
		return row_6_col_6;
	}
	public void setRow_6_col_6(Integer row_6_col_6) {
		this.row_6_col_6 = row_6_col_6;
	}
	public Integer getRow_6_col_7() {
		return row_6_col_7;
	}
	public void setRow_6_col_7(Integer row_6_col_7) {
		this.row_6_col_7 = row_6_col_7;
	}
	public Integer getRow_6_col_8() {
		return row_6_col_8;
	}
	public void setRow_6_col_8(Integer row_6_col_8) {
		this.row_6_col_8 = row_6_col_8;
	}
	public Integer getRow_6_col_9() {
		return row_6_col_9;
	}
	public void setRow_6_col_9(Integer row_6_col_9) {
		this.row_6_col_9 = row_6_col_9;
	}
	public Integer getRow_7_col_1() {
		return row_7_col_1;
	}
	public void setRow_7_col_1(Integer row_7_col_1) {
		this.row_7_col_1 = row_7_col_1;
	}
	public Integer getRow_7_col_2() {
		return row_7_col_2;
	}
	public void setRow_7_col_2(Integer row_7_col_2) {
		this.row_7_col_2 = row_7_col_2;
	}
	public Integer getRow_7_col_3() {
		return row_7_col_3;
	}
	public void setRow_7_col_3(Integer row_7_col_3) {
		this.row_7_col_3 = row_7_col_3;
	}
	public Integer getRow_7_col_4() {
		return row_7_col_4;
	}
	public void setRow_7_col_4(Integer row_7_col_4) {
		this.row_7_col_4 = row_7_col_4;
	}
	public Integer getRow_7_col_5() {
		return row_7_col_5;
	}
	public void setRow_7_col_5(Integer row_7_col_5) {
		this.row_7_col_5 = row_7_col_5;
	}
	public Integer getRow_7_col_6() {
		return row_7_col_6;
	}
	public void setRow_7_col_6(Integer row_7_col_6) {
		this.row_7_col_6 = row_7_col_6;
	}
	public Integer getRow_7_col_7() {
		return row_7_col_7;
	}
	public void setRow_7_col_7(Integer row_7_col_7) {
		this.row_7_col_7 = row_7_col_7;
	}
	public Integer getRow_7_col_8() {
		return row_7_col_8;
	}
	public void setRow_7_col_8(Integer row_7_col_8) {
		this.row_7_col_8 = row_7_col_8;
	}
	public Integer getRow_7_col_9() {
		return row_7_col_9;
	}
	public void setRow_7_col_9(Integer row_7_col_9) {
		this.row_7_col_9 = row_7_col_9;
	}
	public Integer getRow_8_col_1() {
		return row_8_col_1;
	}
	public void setRow_8_col_1(Integer row_8_col_1) {
		this.row_8_col_1 = row_8_col_1;
	}
	public Integer getRow_8_col_2() {
		return row_8_col_2;
	}
	public void setRow_8_col_2(Integer row_8_col_2) {
		this.row_8_col_2 = row_8_col_2;
	}
	public Integer getRow_8_col_3() {
		return row_8_col_3;
	}
	public void setRow_8_col_3(Integer row_8_col_3) {
		this.row_8_col_3 = row_8_col_3;
	}
	public Integer getRow_8_col_4() {
		return row_8_col_4;
	}
	public void setRow_8_col_4(Integer row_8_col_4) {
		this.row_8_col_4 = row_8_col_4;
	}
	public Integer getRow_8_col_5() {
		return row_8_col_5;
	}
	public void setRow_8_col_5(Integer row_8_col_5) {
		this.row_8_col_5 = row_8_col_5;
	}
	public Integer getRow_8_col_6() {
		return row_8_col_6;
	}
	public void setRow_8_col_6(Integer row_8_col_6) {
		this.row_8_col_6 = row_8_col_6;
	}
	public Integer getRow_8_col_7() {
		return row_8_col_7;
	}
	public void setRow_8_col_7(Integer row_8_col_7) {
		this.row_8_col_7 = row_8_col_7;
	}
	public Integer getRow_8_col_8() {
		return row_8_col_8;
	}
	public void setRow_8_col_8(Integer row_8_col_8) {
		this.row_8_col_8 = row_8_col_8;
	}
	public Integer getRow_8_col_9() {
		return row_8_col_9;
	}
	public void setRow_8_col_9(Integer row_8_col_9) {
		this.row_8_col_9 = row_8_col_9;
	}
	public Integer getRow_9_col_1() {
		return row_9_col_1;
	}
	public void setRow_9_col_1(Integer row_9_col_1) {
		this.row_9_col_1 = row_9_col_1;
	}
	public Integer getRow_9_col_2() {
		return row_9_col_2;
	}
	public void setRow_9_col_2(Integer row_9_col_2) {
		this.row_9_col_2 = row_9_col_2;
	}
	public Integer getRow_9_col_3() {
		return row_9_col_3;
	}
	public void setRow_9_col_3(Integer row_9_col_3) {
		this.row_9_col_3 = row_9_col_3;
	}
	public Integer getRow_9_col_4() {
		return row_9_col_4;
	}
	public void setRow_9_col_4(Integer row_9_col_4) {
		this.row_9_col_4 = row_9_col_4;
	}
	public Integer getRow_9_col_5() {
		return row_9_col_5;
	}
	public void setRow_9_col_5(Integer row_9_col_5) {
		this.row_9_col_5 = row_9_col_5;
	}
	public Integer getRow_9_col_6() {
		return row_9_col_6;
	}
	public void setRow_9_col_6(Integer row_9_col_6) {
		this.row_9_col_6 = row_9_col_6;
	}
	public Integer getRow_9_col_7() {
		return row_9_col_7;
	}
	public void setRow_9_col_7(Integer row_9_col_7) {
		this.row_9_col_7 = row_9_col_7;
	}
	public Integer getRow_9_col_8() {
		return row_9_col_8;
	}
	public void setRow_9_col_8(Integer row_9_col_8) {
		this.row_9_col_8 = row_9_col_8;
	}
	public Integer getRow_9_col_9() {
		return row_9_col_9;
	}
	public void setRow_9_col_9(Integer row_9_col_9) {
		this.row_9_col_9 = row_9_col_9;
	}
	public Character getCurrent_game() {
		return current_game;
	}
	public void setCurrent_game(Character current_game) {
		this.current_game = current_game;
	}
	
	public Integer getMissing_digits() {
		return missing_digits;
	}
	public void setMissing_digits(Integer missing_digits) {
		this.missing_digits = missing_digits;
	}
	@Override
	public int hashCode() {
		return Objects.hash(current_game, matrix_id, missing_digits, row_1_col_1, row_1_col_2, row_1_col_3, row_1_col_4,
				row_1_col_5, row_1_col_6, row_1_col_7, row_1_col_8, row_1_col_9, row_2_col_1, row_2_col_2, row_2_col_3,
				row_2_col_4, row_2_col_5, row_2_col_6, row_2_col_7, row_2_col_8, row_2_col_9, row_3_col_1, row_3_col_2,
				row_3_col_3, row_3_col_4, row_3_col_5, row_3_col_6, row_3_col_7, row_3_col_8, row_3_col_9, row_4_col_1,
				row_4_col_2, row_4_col_3, row_4_col_4, row_4_col_5, row_4_col_6, row_4_col_7, row_4_col_8, row_4_col_9,
				row_5_col_1, row_5_col_2, row_5_col_3, row_5_col_4, row_5_col_5, row_5_col_6, row_5_col_7, row_5_col_8,
				row_5_col_9, row_6_col_1, row_6_col_2, row_6_col_3, row_6_col_4, row_6_col_5, row_6_col_6, row_6_col_7,
				row_6_col_8, row_6_col_9, row_7_col_1, row_7_col_2, row_7_col_3, row_7_col_4, row_7_col_5, row_7_col_6,
				row_7_col_7, row_7_col_8, row_7_col_9, row_8_col_1, row_8_col_2, row_8_col_3, row_8_col_4, row_8_col_5,
				row_8_col_6, row_8_col_7, row_8_col_8, row_8_col_9, row_9_col_1, row_9_col_2, row_9_col_3, row_9_col_4,
				row_9_col_5, row_9_col_6, row_9_col_7, row_9_col_8, row_9_col_9);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SudokuMatrix other = (SudokuMatrix) obj;
		return Objects.equals(current_game, other.current_game) && Objects.equals(matrix_id, other.matrix_id)
				&& Objects.equals(missing_digits, other.missing_digits)
				&& Objects.equals(row_1_col_1, other.row_1_col_1) && Objects.equals(row_1_col_2, other.row_1_col_2)
				&& Objects.equals(row_1_col_3, other.row_1_col_3) && Objects.equals(row_1_col_4, other.row_1_col_4)
				&& Objects.equals(row_1_col_5, other.row_1_col_5) && Objects.equals(row_1_col_6, other.row_1_col_6)
				&& Objects.equals(row_1_col_7, other.row_1_col_7) && Objects.equals(row_1_col_8, other.row_1_col_8)
				&& Objects.equals(row_1_col_9, other.row_1_col_9) && Objects.equals(row_2_col_1, other.row_2_col_1)
				&& Objects.equals(row_2_col_2, other.row_2_col_2) && Objects.equals(row_2_col_3, other.row_2_col_3)
				&& Objects.equals(row_2_col_4, other.row_2_col_4) && Objects.equals(row_2_col_5, other.row_2_col_5)
				&& Objects.equals(row_2_col_6, other.row_2_col_6) && Objects.equals(row_2_col_7, other.row_2_col_7)
				&& Objects.equals(row_2_col_8, other.row_2_col_8) && Objects.equals(row_2_col_9, other.row_2_col_9)
				&& Objects.equals(row_3_col_1, other.row_3_col_1) && Objects.equals(row_3_col_2, other.row_3_col_2)
				&& Objects.equals(row_3_col_3, other.row_3_col_3) && Objects.equals(row_3_col_4, other.row_3_col_4)
				&& Objects.equals(row_3_col_5, other.row_3_col_5) && Objects.equals(row_3_col_6, other.row_3_col_6)
				&& Objects.equals(row_3_col_7, other.row_3_col_7) && Objects.equals(row_3_col_8, other.row_3_col_8)
				&& Objects.equals(row_3_col_9, other.row_3_col_9) && Objects.equals(row_4_col_1, other.row_4_col_1)
				&& Objects.equals(row_4_col_2, other.row_4_col_2) && Objects.equals(row_4_col_3, other.row_4_col_3)
				&& Objects.equals(row_4_col_4, other.row_4_col_4) && Objects.equals(row_4_col_5, other.row_4_col_5)
				&& Objects.equals(row_4_col_6, other.row_4_col_6) && Objects.equals(row_4_col_7, other.row_4_col_7)
				&& Objects.equals(row_4_col_8, other.row_4_col_8) && Objects.equals(row_4_col_9, other.row_4_col_9)
				&& Objects.equals(row_5_col_1, other.row_5_col_1) && Objects.equals(row_5_col_2, other.row_5_col_2)
				&& Objects.equals(row_5_col_3, other.row_5_col_3) && Objects.equals(row_5_col_4, other.row_5_col_4)
				&& Objects.equals(row_5_col_5, other.row_5_col_5) && Objects.equals(row_5_col_6, other.row_5_col_6)
				&& Objects.equals(row_5_col_7, other.row_5_col_7) && Objects.equals(row_5_col_8, other.row_5_col_8)
				&& Objects.equals(row_5_col_9, other.row_5_col_9) && Objects.equals(row_6_col_1, other.row_6_col_1)
				&& Objects.equals(row_6_col_2, other.row_6_col_2) && Objects.equals(row_6_col_3, other.row_6_col_3)
				&& Objects.equals(row_6_col_4, other.row_6_col_4) && Objects.equals(row_6_col_5, other.row_6_col_5)
				&& Objects.equals(row_6_col_6, other.row_6_col_6) && Objects.equals(row_6_col_7, other.row_6_col_7)
				&& Objects.equals(row_6_col_8, other.row_6_col_8) && Objects.equals(row_6_col_9, other.row_6_col_9)
				&& Objects.equals(row_7_col_1, other.row_7_col_1) && Objects.equals(row_7_col_2, other.row_7_col_2)
				&& Objects.equals(row_7_col_3, other.row_7_col_3) && Objects.equals(row_7_col_4, other.row_7_col_4)
				&& Objects.equals(row_7_col_5, other.row_7_col_5) && Objects.equals(row_7_col_6, other.row_7_col_6)
				&& Objects.equals(row_7_col_7, other.row_7_col_7) && Objects.equals(row_7_col_8, other.row_7_col_8)
				&& Objects.equals(row_7_col_9, other.row_7_col_9) && Objects.equals(row_8_col_1, other.row_8_col_1)
				&& Objects.equals(row_8_col_2, other.row_8_col_2) && Objects.equals(row_8_col_3, other.row_8_col_3)
				&& Objects.equals(row_8_col_4, other.row_8_col_4) && Objects.equals(row_8_col_5, other.row_8_col_5)
				&& Objects.equals(row_8_col_6, other.row_8_col_6) && Objects.equals(row_8_col_7, other.row_8_col_7)
				&& Objects.equals(row_8_col_8, other.row_8_col_8) && Objects.equals(row_8_col_9, other.row_8_col_9)
				&& Objects.equals(row_9_col_1, other.row_9_col_1) && Objects.equals(row_9_col_2, other.row_9_col_2)
				&& Objects.equals(row_9_col_3, other.row_9_col_3) && Objects.equals(row_9_col_4, other.row_9_col_4)
				&& Objects.equals(row_9_col_5, other.row_9_col_5) && Objects.equals(row_9_col_6, other.row_9_col_6)
				&& Objects.equals(row_9_col_7, other.row_9_col_7) && Objects.equals(row_9_col_8, other.row_9_col_8)
				&& Objects.equals(row_9_col_9, other.row_9_col_9);
	}
	@Override
	public String toString() {
		return "SudokuMatrix [matrix_id=" + matrix_id + ", row_1_col_1=" + row_1_col_1 + ", row_1_col_2=" + row_1_col_2
				+ ", row_1_col_3=" + row_1_col_3 + ", row_1_col_4=" + row_1_col_4 + ", row_1_col_5=" + row_1_col_5
				+ ", row_1_col_6=" + row_1_col_6 + ", row_1_col_7=" + row_1_col_7 + ", row_1_col_8=" + row_1_col_8
				+ ", row_1_col_9=" + row_1_col_9 + ", row_2_col_1=" + row_2_col_1 + ", row_2_col_2=" + row_2_col_2
				+ ", row_2_col_3=" + row_2_col_3 + ", row_2_col_4=" + row_2_col_4 + ", row_2_col_5=" + row_2_col_5
				+ ", row_2_col_6=" + row_2_col_6 + ", row_2_col_7=" + row_2_col_7 + ", row_2_col_8=" + row_2_col_8
				+ ", row_2_col_9=" + row_2_col_9 + ", row_3_col_1=" + row_3_col_1 + ", row_3_col_2=" + row_3_col_2
				+ ", row_3_col_3=" + row_3_col_3 + ", row_3_col_4=" + row_3_col_4 + ", row_3_col_5=" + row_3_col_5
				+ ", row_3_col_6=" + row_3_col_6 + ", row_3_col_7=" + row_3_col_7 + ", row_3_col_8=" + row_3_col_8
				+ ", row_3_col_9=" + row_3_col_9 + ", row_4_col_1=" + row_4_col_1 + ", row_4_col_2=" + row_4_col_2
				+ ", row_4_col_3=" + row_4_col_3 + ", row_4_col_4=" + row_4_col_4 + ", row_4_col_5=" + row_4_col_5
				+ ", row_4_col_6=" + row_4_col_6 + ", row_4_col_7=" + row_4_col_7 + ", row_4_col_8=" + row_4_col_8
				+ ", row_4_col_9=" + row_4_col_9 + ", row_5_col_1=" + row_5_col_1 + ", row_5_col_2=" + row_5_col_2
				+ ", row_5_col_3=" + row_5_col_3 + ", row_5_col_4=" + row_5_col_4 + ", row_5_col_5=" + row_5_col_5
				+ ", row_5_col_6=" + row_5_col_6 + ", row_5_col_7=" + row_5_col_7 + ", row_5_col_8=" + row_5_col_8
				+ ", row_5_col_9=" + row_5_col_9 + ", row_6_col_1=" + row_6_col_1 + ", row_6_col_2=" + row_6_col_2
				+ ", row_6_col_3=" + row_6_col_3 + ", row_6_col_4=" + row_6_col_4 + ", row_6_col_5=" + row_6_col_5
				+ ", row_6_col_6=" + row_6_col_6 + ", row_6_col_7=" + row_6_col_7 + ", row_6_col_8=" + row_6_col_8
				+ ", row_6_col_9=" + row_6_col_9 + ", row_7_col_1=" + row_7_col_1 + ", row_7_col_2=" + row_7_col_2
				+ ", row_7_col_3=" + row_7_col_3 + ", row_7_col_4=" + row_7_col_4 + ", row_7_col_5=" + row_7_col_5
				+ ", row_7_col_6=" + row_7_col_6 + ", row_7_col_7=" + row_7_col_7 + ", row_7_col_8=" + row_7_col_8
				+ ", row_7_col_9=" + row_7_col_9 + ", row_8_col_1=" + row_8_col_1 + ", row_8_col_2=" + row_8_col_2
				+ ", row_8_col_3=" + row_8_col_3 + ", row_8_col_4=" + row_8_col_4 + ", row_8_col_5=" + row_8_col_5
				+ ", row_8_col_6=" + row_8_col_6 + ", row_8_col_7=" + row_8_col_7 + ", row_8_col_8=" + row_8_col_8
				+ ", row_8_col_9=" + row_8_col_9 + ", row_9_col_1=" + row_9_col_1 + ", row_9_col_2=" + row_9_col_2
				+ ", row_9_col_3=" + row_9_col_3 + ", row_9_col_4=" + row_9_col_4 + ", row_9_col_5=" + row_9_col_5
				+ ", row_9_col_6=" + row_9_col_6 + ", row_9_col_7=" + row_9_col_7 + ", row_9_col_8=" + row_9_col_8
				+ ", row_9_col_9=" + row_9_col_9 + ", current_game=" + current_game + ", missing_digits="
				+ missing_digits + "]";
	}
	
	
	  
}
