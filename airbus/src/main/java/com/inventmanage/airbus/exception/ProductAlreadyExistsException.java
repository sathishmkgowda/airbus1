package com.inventmanage.airbus.exception;

public class ProductAlreadyExistsException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ProductAlreadyExistsException(String message) {
		super(message);
	}


}