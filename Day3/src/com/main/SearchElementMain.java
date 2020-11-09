package com.main;

import java.util.Scanner;

import com.pojo.SearchElement;

public class SearchElementMain {

	public static void main(String[] args) {
		SearchElement search = new SearchElement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("Enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int searchElement = sc.nextInt();
		search.search(a, searchElement);
		sc.close();
		search=null;

	}

}
