package com.pojo;

public class UserDefinedException extends Exception {

	private String errorMessage;

	public UserDefinedException() {
		super();
	}

	public UserDefinedException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return "CustomException: InvalidAgeRangeException";
	}

}
