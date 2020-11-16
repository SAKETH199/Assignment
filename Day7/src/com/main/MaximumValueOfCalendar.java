package com.main;

import java.util.Calendar;

public class MaximumValueOfCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Maximum value of the year: " + calendar.getActualMaximum(Calendar.YEAR));
		System.out.println("Maximum value of the month :" + calendar.getActualMaximum(Calendar.MONTH));
		System.out.println("Maximum value of the week :" + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Maximum value of the date :" + calendar.getActualMaximum(Calendar.DATE));
		calendar = null;
	}

}
