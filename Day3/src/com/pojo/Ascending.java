package com.pojo;

public class Ascending {
	private int i;
	private int j;
	private int temp;

	public void ascending(int array[]) {
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("Ascending order:  ");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
