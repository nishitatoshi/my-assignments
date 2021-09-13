package com.techment.exception;

@SuppressWarnings("serial")
public class LoanApplicationNotFoundException extends RuntimeException{

	public LoanApplicationNotFoundException(String msg)
	{
		super(msg);
	}
}
