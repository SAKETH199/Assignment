package com.pojo;

public class CountVowels {
	public int countVowels(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E')
					|| (ch == 'I') || (ch == 'O') || (ch == 'U')) {
				count++;
			}
		}
		return count;
	}
}
