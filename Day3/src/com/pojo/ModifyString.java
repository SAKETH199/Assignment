package com.pojo;

public class ModifyString {
	public static String getString(String str) {
		if (str.length() > 0) {
			if (str.substring(0, 1).equals("k") && !str.substring(1, 2).equals("b")) {
				return str.substring(0, 1) + str.substring(2, str.length());
			} else if (str.substring(1, 2).equals("b") && !str.substring(0, 1).equals("k")) {
				return str.substring(1, 2) + str.substring(2, str.length());
			} else if (str.substring(0, 1).equals("k") && str.substring(1, 2).equals("b")) {
				return str;
			} else {
				return str.substring(2, str.length());
			}
		} else {
			return "";
		}
	}

}
