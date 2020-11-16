package com.pojo;

public class ValidationOfCharacters {

	private static int lastIndex;

	public static int checkCharacters(String word) {
		lastIndex = word.length();
		if (word.charAt(0) == word.charAt(lastIndex - 1)) {
			return 1;
		} else {
			return -1;
		}

	}
}
