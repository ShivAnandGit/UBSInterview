package com.ubs.opsit.interviews.model;


/**
 * @author sthak4
 *
 *A simple POJO to hold the hours, minutes and seconds of regular time 
 */
public class ModernTime {
	
	private final int hours;
	
	private final int minutes;
	
	private final int seconds;
	
	
	public ModernTime(int hours, int minutes, int seconds) {
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}


	public int getHours() {
		return hours;
	}


	public int getMinutes() {
		return minutes;
	}


	public int getSeconds() {
		return seconds;
	}

	
}
