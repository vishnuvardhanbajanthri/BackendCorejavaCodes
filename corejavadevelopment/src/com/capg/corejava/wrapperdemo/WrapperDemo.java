package com.capg.corejava.wrapperdemo;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		int i = 200;
		float f = 22.4f;
		double d = 33.4;

		Integer integer = new Integer(i); // data type value convert to Object data (auto boxing)
		Float float1 = new Float(f);
		Double double1 = new Double(d);

		System.out.println(integer);
		System.out.println(float1);
		System.out.println(double1);

		int b1 = integer.intValue(); // object data conver to int data is called auto unboxing
		System.out.println(b1);

		ArrayList arrayList = new ArrayList(b1);
		System.out.println(arrayList);
	}
}
