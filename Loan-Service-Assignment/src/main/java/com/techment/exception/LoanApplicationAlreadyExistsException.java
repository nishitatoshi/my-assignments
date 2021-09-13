package com.techment.exception;

@SuppressWarnings("serial")
public class LoanApplicationAlreadyExistsException extends RuntimeException{

	public LoanApplicationAlreadyExistsException(String msg) {
		super(msg);
	}
}
