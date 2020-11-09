package com.pojo;

public class SearchElement {
	private int i;
	private int flag = 0;

	public void search(int array[], int searchElement) {
		for (i = 0; i < array.length; i++) {
			if (array[i] == searchElement) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not found");
		}
	}
}
