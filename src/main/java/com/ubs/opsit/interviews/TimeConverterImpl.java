package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.model.BerlinClock;
import com.ubs.opsit.interviews.model.ModernTime;
import com.ubs.opsit.interviews.util.Util;


/**
 * @author sthak4
 *
 */
public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		ModernTime modernTime=Util.parseTime(aTime);
		BerlinClock berlinClock = convertToBerlinClockTime(modernTime);
		return berlinClock.toString();
	}
	
	private BerlinClock convertToBerlinClockTime(ModernTime modernTime){
		BerlinClock berlinClock = new BerlinClock();
		setLampOnSeconds(berlinClock,modernTime);
		setLampOnHours(berlinClock,modernTime);		
		setLampOnMinutes(berlinClock,modernTime);
		return berlinClock;
	}
	
	private BerlinClock setLampOnSeconds(BerlinClock berlinClock, ModernTime modernTime){
		if(modernTime.getSeconds()%2==0){
			berlinClock.getLamps().get(0).setState(true);
		}
		return berlinClock;
	}
	
	private BerlinClock setLampOnHours(BerlinClock berlinClock, ModernTime modernTime){
		int topHoursOn = modernTime.getHours()/5;
		for(int i=1;i<=topHoursOn;i++){
			berlinClock.getLamps().get(i).setState(true);
		}
		int bottomHoursOn = modernTime.getHours()%5;
		for(int i=5;i<bottomHoursOn+5;i++){
			berlinClock.getLamps().get(i).setState(true);
		}
		return berlinClock;
	}
	
	private BerlinClock setLampOnMinutes(BerlinClock berlinClock, ModernTime modernTime){
		int topMinutesOn = modernTime.getMinutes()/5;
		for(int i=9;i<9+topMinutesOn;i++){
			berlinClock.getLamps().get(i).setState(true);
		}
		int bottomMinutesOn = modernTime.getMinutes()%5;
		for(int i=20;i<20+bottomMinutesOn;i++){
			berlinClock.getLamps().get(i).setState(true);
		}
		return berlinClock;
	}
}
