package com.ubs.opsit.interviews.parsers;


/**
 * @author sthak4
 * Factory class to instantiate appropriate Parser depending on userInput.
 * This helps in a scalable code and helps in separation of Parser logic
 * from main code
 */
public class ParserFactory {
	
	// Private constructor to avoid unnecessary instantiation
	private ParserFactory(){
	}

    public static InputTimeparser getDefaultParser() {
    	return new HhmmssTimeParser();
    }

    //Possible conditions for Factory extension
   /* public static InputTimeparser getParser(String aTime) {
    	InputTimeparser parser = new HhmmssTimeParser();
        return parser;
    }*/
}
