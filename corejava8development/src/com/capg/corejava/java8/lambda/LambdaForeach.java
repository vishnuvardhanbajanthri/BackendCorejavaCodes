package com.capg.corejava.java8.lambda;

import java.awt.List;
import java.util.ArrayList;

public class LambdaForeach {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Hello");
		list.add("Hii");
		list.add("How are you");
		list.add("Where are u");

		for (String string : list) {
			System.out.println(string);
		}

	}
}

//O/P
//Hello
//Hii
//How are you
//Where are u