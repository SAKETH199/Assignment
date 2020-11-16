package com.pojo;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Employee {
	public static LinkedHashMap<String, String> obtainDesignation(LinkedHashMap<String, String> h1, String n) {
		LinkedHashMap<String, String> employee = new LinkedHashMap<String, String>();
		Iterator<String> it = employee.keySet().iterator();
		while (it.hasNext()) {
			String s2 = it.next();
			String s3 = employee.get(s2);
			if (s3.equals(n)) {
				employee.put(s2, s3);
			}
		}
		return employee;
	}
}
