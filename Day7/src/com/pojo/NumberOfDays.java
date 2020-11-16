package com.pojo;

import java.util.Calendar;

public class NumberOfDays {
	
private static int days;
	public static int display(int year, int month) {
		Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month);
	    days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    return days;
}
}
