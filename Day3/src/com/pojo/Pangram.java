package com.pojo;

public class Pangram {
	private int flag = 1;
	private int index = 0;
	private boolean[] value = new boolean[26];

	public String checkPangram(String sentence) {
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) >= 'A') && (sentence.charAt(i) <= 'Z')) {
				index = sentence.charAt(i) - 'A';
			} else if ((sentence.charAt(i) >= 'a') && (sentence.charAt(i) <= 'z')) {
				index = sentence.charAt(i) - 'a';
			}
			value[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (value[i] == false) {
				flag = 0;
			}
		}
		if (flag == 1) {
			return "The given string is pangram";
		} else {
			return "The given string is not pangram";
		}
	}

}
