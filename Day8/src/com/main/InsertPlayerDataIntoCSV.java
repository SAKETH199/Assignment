package com.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertPlayerDataIntoCSV {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String playerName = sc.nextLine();
		System.out.println("Enter the team name: ");
		String teamName = sc.nextLine();
		System.out.println("Enter the number of matches played: ");
		String numberOfMatches = sc.nextLine();

		List<List<String>> rows = Arrays.asList(Arrays.asList(playerName, teamName, numberOfMatches));

		FileWriter csvWriter = new FileWriter("/D:\\Assignment/players.csv");
		csvWriter.append("<name>");
		csvWriter.append(",");
		csvWriter.append("<teamName");
		csvWriter.append(",");
		csvWriter.append("numberOfMatches");
		csvWriter.append("\n");

		for (List<String> rowData : rows) {
			csvWriter.append(String.join(",", rowData));
			csvWriter.append("\n");
		}

		csvWriter.flush();
		csvWriter.close();
		sc.close();
	}
}
