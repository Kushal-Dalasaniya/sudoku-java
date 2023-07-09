package game.com.sudoku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import game.com.sudoku.entity.SudokuMatrix;

public interface SudokuRepository extends JpaRepository<SudokuMatrix, Integer> {
	/*
	 * Get current sudoku game details 
	 */
	@Query(value = "SELECT sm FROM sudoku_matrix sm WHERE sm.current_game = :ch")
	List<SudokuMatrix> findByCurrentGame(@Param("ch") Character ch);
}
