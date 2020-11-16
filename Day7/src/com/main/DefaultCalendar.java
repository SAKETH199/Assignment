package com.main;

import java.time.LocalDateTime;

public class DefaultCalendar {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Information of default calendar");
		System.out.println("Year : " + now.getYear());
		System.out.println("Month : " + now.getDayOfMonth());
		System.out.println("day : " + now.getDayOfMonth());
		System.out.println("hour : " + now.getHour());
		System.out.println("minute : " + now.getMinute());
		System.out.println("second : " + now.getSecond());
		now = null;
	}

}
