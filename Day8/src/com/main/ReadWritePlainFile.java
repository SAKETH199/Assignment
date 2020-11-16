package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWritePlainFile {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line = "";
		try {
			String filename = "/D:\\Assignment/new.txt";
			FileWriter fw = new FileWriter(filename, false);
			fw.write("JAVA ASSIGNMENT");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("/D:\\Assignment/new.txt"));
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
