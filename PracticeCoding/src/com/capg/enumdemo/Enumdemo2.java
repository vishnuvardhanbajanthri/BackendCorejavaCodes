package com.capg.enumdemo;

public class Enumdemo2 {
	enum NEWS {
		north, east, west, south
	}

	enum VEHICAL {
		car, bus, bike, train
	}

	enum ELECTRICAL {
		tv, mobile, mp3player
	}

	public static void main(String[] args) {
		NEWS name = NEWS.south;
		VEHICAL name2 = VEHICAL.car;
		ELECTRICAL name3 = ELECTRICAL.mp3player;

		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
	}
}
