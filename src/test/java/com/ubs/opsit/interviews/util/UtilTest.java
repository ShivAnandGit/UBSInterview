package com.ubs.opsit.interviews.util;

import java.lang.invoke.WrongMethodTypeException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ubs.opsit.interviews.model.ModernTime;


public class UtilTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void shouldParseIntoModernTimeObjectForValidDate(){
		ModernTime parsedObj=Util.parseTime("03:15:46");
		Assert.assertTrue(parsedObj.getHours()==3);
		Assert.assertTrue(parsedObj.getMinutes()==15);
		Assert.assertTrue(parsedObj.getSeconds()==46);
	}
	
	@Test()
	public void shouldParseIntoModernTimeObjectForBoundary24(){
		ModernTime parsedObj=Util.parseTime("24:00:00");
		Assert.assertTrue(parsedObj.getHours()==24);
		Assert.assertTrue(parsedObj.getMinutes()==0);
		Assert.assertTrue(parsedObj.getSeconds()==0);
	}
	
	@Test()
	public void shouldThrowExceptionForInvalidTime(){
		exception.expect(WrongMethodTypeException.class);
		Util.parseTime("33:45:67");
	}
}
