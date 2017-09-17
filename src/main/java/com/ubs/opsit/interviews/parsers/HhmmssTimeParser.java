package com.ubs.opsit.interviews.parsers;

import java.lang.invoke.WrongMethodTypeException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.ubs.opsit.interviews.enums.Constants;
import com.ubs.opsit.interviews.model.ModernTime;

public class HhmmssTimeParser implements InputTimeparser {

	@Override
	public ModernTime parseInputTime(String aTime) {
		//Boundary condition handled separately, as Java Date parsing logic
		//doesn't recognize 24:00:00 and converts to 00:00:00
		//Woraround is to use TemporalAccessor to get raw input and then
		//use parseExcessDays but is more of a hack than an elegant solution 
		if(aTime.equals("24:00:00")){
			return new ModernTime(24, 0, 0);
		}
		DateFormat timeFormat = new SimpleDateFormat(Constants.TIME_FORMAT.value());
		timeFormat.setLenient(false);
		try {
			Date date=timeFormat.parse(aTime);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			int hours = calendar.get(Calendar.HOUR_OF_DAY);
			int minutes = calendar.get(Calendar.MINUTE);
			int seconds = calendar.get(Calendar.SECOND);
			return new ModernTime(hours, minutes, seconds);
		} catch (ParseException e) {
			throw new WrongMethodTypeException(Constants.WRONG_INPUT.value());
		}
	}
}


