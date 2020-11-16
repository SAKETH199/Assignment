package com.main;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class First3Lines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines to read : ");
		int max = sc.nextInt();

		try {
			LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("/D:\\Assignment/sample2.txt"));
			String line = lineNumberReader.readLine();
			for (int i = 1; i <= max; i++) {
				int number = lineNumberReader.getLineNumber();
				System.out.println(number + " : " + line);
				line = lineNumberReader.readLine();
				if (line == null) {
					System.out.println("end of file reached");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
