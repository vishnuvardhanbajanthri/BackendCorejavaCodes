package com.capg.corejava.Enum;

public class EnumDemo1 {
	enum NEWS {
		North, East, West, South
	}

	enum Colour {
		Red, Green, Yellow
	}

	enum Laptop {
		Apple, Hp, Acer
	}

	public static void main(String[] args) {
		NEWS s = NEWS.North;
		Colour c = Colour.Red;
		Laptop l = Laptop.Apple;
		System.out.println(s);
		System.out.println(c);
		System.out.println(l);
	}

}

//O/P
//North
//Red
//Apple
