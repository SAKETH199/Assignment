package com.pojo;

public class ReplaceCharacter {
	private String newSentence;

	public String replaceCharacter(String sentence) {
		sentence.toLowerCase();
		newSentence = sentence.replace('d', 'h');
		return newSentence;
	}
}
