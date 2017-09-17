package com.ubs.opsit.interviews.parsers;

import org.junit.Assert;
import org.junit.Test;

public class ParserFactoryTest {
	
	@Test
	public void shouldGetHhmmssParserObject(){
		Assert.assertTrue(ParserFactory.getDefaultParser() instanceof HhmmssTimeParser);
	}

}
