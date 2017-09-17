package com.ubs.opsit.interviews.model;

import com.ubs.opsit.interviews.enums.LampColor;
import com.ubs.opsit.interviews.enums.LampType;

/**
 * @author sthak4
 * Class representation of Red/Yellow Lamps that constitute Berlin clock
 * Each lamp object when constructed has information about its color, numeric strength
 * and whether it represents hour, minute or second 
 */
public class Lamp {

	private boolean state;
	private final String lampColor;
	private final Enum<LampType> lampType;
	private final int timeMultiplier; 
	
	public Lamp(String lampColor, Enum<LampType> lampType, int timeMultiplier) {
		this.lampColor = lampColor;
		this.lampType =lampType;
		this.timeMultiplier =timeMultiplier;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return state ? lampColor : LampColor.OFF.value();
	}

	public String getLampColor() {
		return lampColor;
	}

	public Enum<LampType> getLampType() {
		return lampType;
	}

	public int getTimeMultiplier() {
		return timeMultiplier;
	}
	
	
}
