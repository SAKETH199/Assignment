package com.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompareTwoDates {
	private static int flag;
	public static String formattedDate1;
	public static String formattedDate2;

	public static String findOldDate(String date1, String date2) throws ParseException {
		if (date1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")
				&& (date2.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
			Date d1 = simpleDateFormat.parse(date1);
			Date d2 = simpleDateFormat.parse(date2);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d1);
			long y = cal.getTimeInMillis();
			cal.setTime(d2);
			long y1 = cal.getTimeInMillis();
			formattedDate1 = simpleDateFormat1.format(d1);
			formattedDate2 = simpleDateFormat1.format(d2);
			if (y < y1) {
				flag = 1;
			} else {
				flag = 0;
			}
		}
		if (flag == 1)
			return formattedDate1;
		else
			return formattedDate2;
	}
}
