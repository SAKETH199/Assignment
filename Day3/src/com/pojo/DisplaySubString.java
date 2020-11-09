package com.pojo;

public class DisplaySubString {
 private  String subString;
 public String printSubString(String str,int from,int to)
 {
	 subString=str.substring(from, to);
	 return subString;
	 
	 
 }
}
