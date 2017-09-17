package com.ubs.opsit.interviews.model;

import java.util.ArrayList;
import java.util.List;

import com.ubs.opsit.interviews.enums.LampColor;
import com.ubs.opsit.interviews.enums.LampType;

/**
 * @author sthak4
 * Class representation of the Berlin clock.
 * Objects of this class represent all the Red Yellow lamps of Berlin clock 
 * at their right position. They are initialised to be in Off state 
 */
public class BerlinClock {
	
	private List<Lamp> lamps;

	public BerlinClock() {
		super();
		List<Lamp> berlinClockLamps = init();
		this.lamps = berlinClockLamps;
	}

	private List<Lamp> init() {
		List<Lamp> berlinClockLamps = new ArrayList<>();
		Lamp secondsLamp = new Lamp(LampColor.YELLOW.value(), LampType.SECONDS_LAMP, 1);
		berlinClockLamps.add(secondsLamp);
		Lamp lamp =null;
		for(int i=1;i<=8;i++){
			if(i/4<1){
				lamp = new Lamp(LampColor.RED.value(), LampType.HOURS_LAMP, 5);
			}
			else{
				lamp = new Lamp(LampColor.RED.value(), LampType.HOURS_LAMP, 1);	
			}
			berlinClockLamps.add(lamp);
		}
		
		for(int i=1;i<=11;i++){
			if(i%3==0){
				lamp = new Lamp(LampColor.RED.value(), LampType.MINUTES_LAMP, 5);
			}else{
				lamp = new Lamp(LampColor.YELLOW.value(), LampType.MINUTES_LAMP, 5);
			}
			berlinClockLamps.add(lamp);
		}
		for (int i=0;i<4;i++){
			lamp = new Lamp(LampColor.YELLOW.value(), LampType.MINUTES_LAMP, 1);
			berlinClockLamps.add(lamp);
		}
		return berlinClockLamps;
	}
	
	public List<Lamp> getLamps() {
		return lamps;
	}
	
	@Override
	public String toString() {
		StringBuffer outputString = new StringBuffer();
		int count=0;
		for(Lamp lamp: lamps){
			outputString.append(lamp.toString());
			count++;
			if(count==1||count==5||count==9 ||count==20){
				outputString.append("\r\n");
			}
		}
		return new String(outputString);
	}
}
