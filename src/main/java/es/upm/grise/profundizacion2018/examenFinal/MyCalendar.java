package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {

	 Calendar calendar = Calendar.getInstance();
	
	public Calendar getMyCalendar() {
		return calendar;		
	}
	
	public int getHourOfTheDay() {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
}
