package com.pojo;

import java.util.Calendar;

public class Days {
	private static int numberOfDays;
	public static int getNumberOfDays(int year,int month)
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		numberOfDays=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return numberOfDays;
	}

}
