package com.ubs.opsit.interviews.parsers;

import java.lang.invoke.WrongMethodTypeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ubs.opsit.interviews.model.ModernTime;
import com.ubs.opsit.interviews.util.Util;

public class HhmmssparserTest {
	HhmmssTimeParser parser;

	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setUp(){
		parser = new HhmmssTimeParser();
	}

	@Test
	public void shouldParseIntoModernTimeObjectForValidDate(){
		ModernTime parsedObj=parser.parseInputTime("03:15:46");
		Assert.assertTrue(parsedObj.getHours()==3);
		Assert.assertTrue(parsedObj.getMinutes()==15);
		Assert.assertTrue(parsedObj.getSeconds()==46);
	}

	@Test()
	public void shouldParseIntoModernTimeObjectForBoundary24(){
		ModernTime parsedObj=parser.parseInputTime("24:00:00");
		Assert.assertTrue(parsedObj.getHours()==24);
		Assert.assertTrue(parsedObj.getMinutes()==0);
		Assert.assertTrue(parsedObj.getSeconds()==0);
	}

	@Test()
	public void shouldThrowExceptionForInvalidTime(){
		exception.expect(WrongMethodTypeException.class);
		parser.parseInputTime("33:15:46");
	}

}
