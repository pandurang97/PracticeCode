package SelecniumCode;

import java.util.Calendar;

public class CalendarObjects {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();		
		System.out.println(cal.get(Calendar.DATE)); //Current Date
		System.out.println(cal.get(Calendar.AM_PM)); //Current AM/PM
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //Current Day
		System.out.println(cal.get(Calendar.SECOND)); //Current Seconds
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //Week of the year
		
	}

}
