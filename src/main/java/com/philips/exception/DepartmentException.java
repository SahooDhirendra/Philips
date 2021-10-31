package com.philips.exception;

public class DepartmentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4495918606535687821L;

	public DepartmentException(String message) {
		super(message);
	}

	public DepartmentException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}

}
