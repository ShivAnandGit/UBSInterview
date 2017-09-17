package com.ubs.opsit.interviews.enums;

public enum LampColor {
	RED("R"),
	YELLOW("Y"),
	OFF("O");
	
	private String value;
	
	private LampColor(String value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}

	public String value() {
		return value;
	}
}
