package com.hcl.ecommerce.exception;

public class PasswordMismatchException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordMismatchException(String message) {
		super(message);
	}

}
