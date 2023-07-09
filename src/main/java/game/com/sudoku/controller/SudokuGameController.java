package game.com.sudoku.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import game.com.sudoku.exception.SudokuGameException;
import game.com.sudoku.model.InsertDataInMatrix;
import game.com.sudoku.model.SudokuGameMatrix;
import game.com.sudoku.service.SudokuGameService;
import game.com.sudoku.util.HeaderMapper;
import game.com.sudoku.util.SudokuGameConstants;
import game.com.sudoku.util.SudokuGameExceptionConstants;
import io.swagger.annotations.ApiParam;

@CrossOrigin
@RestController
public class SudokuGameController implements SudokuGameApi {

	@Autowired
	private Environment env;
	@Autowired
	private SudokuGameService sudokuGameService;
	
	@Override
	public ResponseEntity<SudokuGameMatrix> startSudoku(@ApiParam(value = "Supported Content Type- application/json" ,required=true) @RequestHeader(value="Accept", required=true) String accept
			,@ApiParam(value = "A unique identifier value that is attached to requests that allow reference to a particular transaction." ,required=true) @RequestHeader(value="CorrelationId", required=true) String correlationId) {
		
		if(accept == null || !accept.contains(SudokuGameConstants.APPLICATION_JSON)) 
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		
		HttpHeaders responseHeaders = HeaderMapper.getHttpHeaders(correlationId);
		
		try {
			SudokuGameMatrix response = sudokuGameService.startSudokuGame(correlationId);
			return new ResponseEntity<>(response,responseHeaders,HttpStatus.OK);
		}
		catch(SudokuGameException ex) {
			throw new SudokuGameException(ex.getStatusCode(), ex.getCode(), ex.getMessage(), correlationId);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new SudokuGameException(HttpStatus.INTERNAL_SERVER_ERROR, SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001, 
					env.getRequiredProperty(SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001), correlationId);
		}
	}
	
	@Override
	public ResponseEntity<SudokuGameMatrix> addValueInSudoku(@ApiParam(value = "Supported Content Type- application/json" ,required=true) @RequestHeader(value="Accept", required=true) String accept
			,@ApiParam(value = "A unique identifier value that is attached to requests that allow reference to a particular transaction." ,required=true) @RequestHeader(value="CorrelationId", required=true) String correlationId
			,@ApiParam(value = "The sudoku matrix ID.",required=true) @PathVariable("matrixId") Integer matrixId
			,@ApiParam(value = "Add value in sudoku payload" ,required=true )  @Valid @RequestBody InsertDataInMatrix body
			){
		if(accept == null || !accept.contains(SudokuGameConstants.APPLICATION_JSON)) 
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		
		HttpHeaders responseHeaders = HeaderMapper.getHttpHeaders(correlationId);
		
		try {
			SudokuGameMatrix response = sudokuGameService.addValueInSudoku(correlationId,matrixId,body);
			return new ResponseEntity<>(response,responseHeaders,HttpStatus.OK);
		}
		catch(SudokuGameException ex) {
			throw new SudokuGameException(ex.getStatusCode(), ex.getCode(), ex.getMessage(), correlationId);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new SudokuGameException(HttpStatus.INTERNAL_SERVER_ERROR, SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001, 
					env.getRequiredProperty(SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001), correlationId);
		}
	}
	
	@Override
	public ResponseEntity<SudokuGameMatrix> getSudokuMatrix(@ApiParam(value = "Supported Content Type- application/json" ,required=true) @RequestHeader(value="Accept", required=true) String accept
			,@ApiParam(value = "A unique identifier value that is attached to requests that allow reference to a particular transaction." ,required=true) @RequestHeader(value="CorrelationId", required=true) String correlationId
			,@ApiParam(value = "The sudoku matrix ID.",required=true) @PathVariable("matrixId") Integer matrixId)
	{
		if(accept == null || !accept.contains(SudokuGameConstants.APPLICATION_JSON)) 
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		
		HttpHeaders responseHeaders = HeaderMapper.getHttpHeaders(correlationId);
		
		try {
			SudokuGameMatrix response = sudokuGameService.getSudokuMatrix(matrixId,correlationId);
			return new ResponseEntity<>(response,responseHeaders,HttpStatus.OK);
		}
		catch(SudokuGameException ex) {
			throw new SudokuGameException(ex.getStatusCode(), ex.getCode(), ex.getMessage(), correlationId);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new SudokuGameException(HttpStatus.INTERNAL_SERVER_ERROR, SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001, 
					env.getRequiredProperty(SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001), correlationId);
		}
	}
	
	
	public ResponseEntity<SudokuGameMatrix> newSudokuMatrix(@ApiParam(value = "Supported Content Type- application/json" ,required=true) @RequestHeader(value="Accept", required=true) String accept
			,@ApiParam(value = "A unique identifier value that is attached to requests that allow reference to a particular transaction." ,required=true) @RequestHeader(value="CorrelationId", required=true) String correlationId
			){
		
		if(accept == null || !accept.contains(SudokuGameConstants.APPLICATION_JSON)) 
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		
		HttpHeaders responseHeaders = HeaderMapper.getHttpHeaders(correlationId);
		
		try {
			SudokuGameMatrix response = sudokuGameService.newSudokuGame(correlationId);
			return new ResponseEntity<>(response,responseHeaders,HttpStatus.OK);
		}
		catch(SudokuGameException ex) {
			throw new SudokuGameException(ex.getStatusCode(), ex.getCode(), ex.getMessage(), correlationId);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new SudokuGameException(HttpStatus.INTERNAL_SERVER_ERROR, SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001, 
					env.getRequiredProperty(SudokuGameExceptionConstants.SUDOKU_GAME_ERROR_0001), correlationId);
		}
	}

}
