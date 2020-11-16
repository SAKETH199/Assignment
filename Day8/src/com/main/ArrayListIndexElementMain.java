package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.pojo.ArrayListIndexElement;

public class ArrayListIndexElementMain {
	public static void main(String[] args) {

		ArrayListIndexElement arrayListIndexElement = new ArrayListIndexElement();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println("Enter elements for list1: ");
		for (int i = 0; i < 5; i++) {
			arrayList1.add(sc.nextInt());
		}
		System.out.println("Enter elements for list2: ");
		for (int j = 0; j < 5; j++) {
			arrayList2.add(sc.nextInt());
		}

		result = arrayListIndexElement.sortMergedArrayList(arrayList1, arrayList2);
		System.out.println("Elements at specified index: ");
		for (int k = 0; k < 3; k++) {
			System.out.println(result.get(k));
		}
		sc.close();
	}
}
