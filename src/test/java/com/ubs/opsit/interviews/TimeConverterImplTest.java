package com.ubs.opsit.interviews;

import java.lang.invoke.WrongMethodTypeException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class TimeConverterImplTest {
	private TimeConverter timeConverter;
	
	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	
	@Before
	public void SetUp(){
		timeConverter = new TimeConverterImpl();
	}
	
	@Test
	public void shouldReturnValidBerlinTimeForValidTime(){
		String berlinTime = timeConverter.convertTime("00:00:00");
		Assert.assertTrue(berlinTime.equalsIgnoreCase("Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO"));
		Assert.assertTrue(timeConverter.convertTime("13:17:01").equalsIgnoreCase("O\r\nRROO\r\nRRRO\r\nYYROOOOOOOO\r\nYYOO"));
	}
	
	
	@Test()
	public void shouldreturnValidBerlinTimeForBoundaryValue24(){
		String berlinTime = timeConverter.convertTime("24:00:00");
		Assert.assertTrue(berlinTime.equalsIgnoreCase("Y\r\nRRRR\r\nRRRR\r\nOOOOOOOOOOO\r\nOOOO"));
	}
	
	@Test()
	public void shouldThrowParseExceptionForInvalidTime(){
		exception.expect(WrongMethodTypeException.class);
		timeConverter.convertTime("26:76:00");
	}
	
	@Test()
	public void shouldThrowParseExceptionForNonNumeric(){
		exception.expect(WrongMethodTypeException.class);
		timeConverter.convertTime("ab:34:xz");
	}
	
}
