package com.challenge.services.exceptions;

public class IncorrectFormatException extends Exception {
	private static final long serialVersionUID = 1L;

	public IncorrectFormatException(String message){
		super(message);
	}
}
