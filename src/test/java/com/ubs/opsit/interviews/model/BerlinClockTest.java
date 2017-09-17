package com.ubs.opsit.interviews.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.enums.LampColor;


public class BerlinClockTest {
	BerlinClock berlinClock;
	
	@Before
	public void setUp(){
		berlinClock = new BerlinClock();
	}
	
	@Test
	public void shouldSuccessfullyInitializeBerlinClock(){
		Assert.assertTrue(berlinClock.getLamps().size()==24);
	}
	
	@Test
	public void shouldAllLampsInitializeToOffAndIsWellFormatted(){
		Assert.assertEquals("O\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO", berlinClock.toString());
	}
	
	@Test
	public void shouldTestSecondsLampYellow(){
		Assert.assertEquals(LampColor.YELLOW.value(), berlinClock.getLamps().get(0).getLampColor());
	}
	
	@Test
	public void shouldTestEveryThirdMinutesLampsRedInFirstMinRow(){
		for(int i=11; i<20;i=i+3){
		Assert.assertEquals(LampColor.RED.value(), berlinClock.getLamps().get(i).getLampColor());
		}
	}
	
	@Test
	public void shouldTestAllOtherMinLampsInFirstMinRowYellow(){
		for(int i=9; i<20 && i%3!=0;i++){
		Assert.assertEquals(LampColor.YELLOW.value(), berlinClock.getLamps().get(i).getLampColor());
		}
	}
	
	@Test
	public void shouldTestAllMinuteLampsLastRowyellow(){
		for(int i=20; i<24;i++){
		Assert.assertEquals(LampColor.YELLOW.value(), berlinClock.getLamps().get(i).getLampColor());
		}
	}
	
	
}
