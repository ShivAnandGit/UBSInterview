package com.ubs.opsit.interviews.util;

import com.ubs.opsit.interviews.model.ModernTime;
import com.ubs.opsit.interviews.parsers.InputTimeparser;
import com.ubs.opsit.interviews.parsers.ParserFactory;

public final class Util {

  // Creating a private constructor so that the class is NOT unnecessarily instantiated
    private Util() {
    }
    
	public static ModernTime parseTime(String aTime){
		InputTimeparser timeParser= ParserFactory.getDefaultParser();
		return timeParser.parseInputTime(aTime);
}
}
