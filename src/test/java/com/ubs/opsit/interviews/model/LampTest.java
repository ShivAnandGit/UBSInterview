package com.ubs.opsit.interviews.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.enums.LampColor;
import com.ubs.opsit.interviews.enums.LampType;

public class LampTest {
	
	
	
	@Test
	public void shouldSuccessfullyCreateRedLamp(){
		Lamp lamp = new Lamp(LampColor.RED.value(), LampType.HOURS_LAMP, 5);
		Assert.assertEquals(LampColor.RED.value(),lamp.getLampColor());
		Assert.assertEquals(LampType.HOURS_LAMP,lamp.getLampType());
	}
	
	@Test
	public void shouldSuccessfullyCreateYellowLamp(){
		Lamp lamp = new Lamp(LampColor.YELLOW.value(), LampType.MINUTES_LAMP, 5);
		Assert.assertEquals(LampColor.YELLOW.value(),lamp.getLampColor());
		Assert.assertEquals(LampType.MINUTES_LAMP,lamp.getLampType());
	}
	
	@Test
	public void shouldIndicateRWhenRedLampStateTrue(){
		Lamp lamp = new Lamp(LampColor.RED.value(), LampType.MINUTES_LAMP, 5);
		lamp.setState(true);
		Assert.assertEquals("R",lamp.toString());
	}
	
	@Test
	public void shouldIndicateYWhenYellowLampStateTrue(){
		Lamp lamp = new Lamp(LampColor.YELLOW.value(), LampType.MINUTES_LAMP, 5);
		lamp.setState(true);
		Assert.assertEquals("Y",lamp.toString());
	}
	
	@Test
	public void shouldIndicateOWhenLampInitialised(){
		Lamp yellowLamp = new Lamp(LampColor.YELLOW.value(), LampType.MINUTES_LAMP, 5);
		Lamp redLamp = new Lamp(LampColor.YELLOW.value(), LampType.MINUTES_LAMP, 5);
		Assert.assertEquals("O",yellowLamp.toString());
		Assert.assertEquals("O",redLamp.toString());
	}
}
