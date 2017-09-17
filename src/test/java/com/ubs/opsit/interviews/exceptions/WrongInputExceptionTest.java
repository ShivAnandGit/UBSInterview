package com.ubs.opsit.interviews.exceptions;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.enums.Constants;

import java.text.ParseException;

import org.junit.Assert;

public class WrongInputExceptionTest {
	WrongTimeInputException wrongInputException;
	
	@Before
	public void setUp(){
		wrongInputException = new WrongTimeInputException(Constants.WRONG_INPUT.value());
	}
	
	@Test
	public void shouldThrowExceptionWithCustommessage(){
		Assert.assertEquals(Constants.WRONG_INPUT.value(), wrongInputException.getMessage());
	}
}
