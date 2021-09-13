package com.techment.exception;

@SuppressWarnings("serial")
public class UnAuthorisedException extends RuntimeException {

	public UnAuthorisedException(String msg)
	{
		super(msg);
	}
}
