package com.pojo;

public class Smallest {
	public String Smaller(int number1, int number2, int number3) {
		if ((number1 < number2) && (number1 < number3)) {
			return " number1 is smallest";
		} else if ((number2 < number1) && (number2 < number3)) {
			return "number2 is smallest";
		} else {
			return "number3 is smallest";
		}
	}

}
