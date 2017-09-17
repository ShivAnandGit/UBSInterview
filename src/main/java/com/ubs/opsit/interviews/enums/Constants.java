package com.ubs.opsit.interviews.enums;

public enum Constants {
	WRONG_INPUT("Please provide valid time in HH:mm:ss format"),
	TIME_FORMAT("HH:mm:ss");
	
	private String value;
	
	private Constants(String value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}

	public String value() {
		return value;
	}

}
