package com.techment.exception;

@SuppressWarnings("serial")
public class InvalidUserException extends RuntimeException {
	String msg;

	public InvalidUserException(String msg) {
	
		super(msg);
		
	}
}
