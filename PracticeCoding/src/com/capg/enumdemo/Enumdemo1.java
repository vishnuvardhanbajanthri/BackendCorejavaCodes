package com.capg.enumdemo;

public class Enumdemo1 {

	enum NEWS {
		north, east, west, south
	}

	enum COLOUR {
		red, yellow, blue, white, black
	}

	enum STATIONARY {
		book, pen, pencil, testbook
	}

	public static void main(String[] args) {
		NEWS name = NEWS.north;
		COLOUR name2 = COLOUR.blue;
		STATIONARY name3 = STATIONARY.book;

		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
	}

}
