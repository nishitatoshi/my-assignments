package com.techment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value=LoanApplicationAlreadyExistsException.class)
	public ResponseEntity<String> myException(LoanApplicationAlreadyExistsException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value=LoanApplicationNotFoundException.class)
	public ResponseEntity<String> myException(LoanApplicationNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=InvalidUserException.class)
	public ResponseEntity<String> myException(InvalidUserException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(value=UnAuthorisedException.class)
	public ResponseEntity<String> myException(UnAuthorisedException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.UNAUTHORIZED);
	}

}
