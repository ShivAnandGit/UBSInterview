package com.ubs.opsit.interviews.exceptions;

public class WrongTimeInputException extends RuntimeException {

	/**
	 * Custom Runtime exception thrown when invalid time input entered
	 */
	private static final long serialVersionUID = 1L;
	
	public WrongTimeInputException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
	/*public WrongTimeInputException(Throwable e) {
		super(e);
	}
*/
}
