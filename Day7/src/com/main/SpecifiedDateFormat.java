
package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SpecifiedDateFormat {

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted = current.format(formatter);

		System.out.println("Current Date and Time is: " + formatted);
		current = null;
		formatter = null;
	}

}
