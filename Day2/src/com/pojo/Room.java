package com.pojo;

public class Room {
	public int roomNo;
	public String roomType;
	public int roomArea;
	public String roomAC;

	public void setData() {
		roomNo = 234;
		roomType = "Square";
		roomArea = 1200;
		roomAC = "LG";
	}

	public void displayData()

	{
		System.out.println("Room number is : " + roomNo);
		System.out.println("Room type is : " + roomType);
		System.out.println("Room Area is : " + roomArea);
		System.out.println("Room AC is :" + roomAC);
	}

}
