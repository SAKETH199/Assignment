package com.main;

import com.pojo.Room;

public class RoomMain {

	public static void main(String[] args) {
		Room room = new Room();
		room.setData();
		room.displayData();
		room = null;

	}

}
