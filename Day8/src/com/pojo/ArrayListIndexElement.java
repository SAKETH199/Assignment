package com.pojo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIndexElement {
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2)
	{
	arrayList1.addAll(arrayList2);
	Collections.sort(arrayList1);
	ArrayList<Integer> result=new ArrayList<Integer>();
	result.add(arrayList1.get(2));
	result.add(arrayList1.get(6));
	result.add(arrayList1.get(8));
	return result;
	}

}
