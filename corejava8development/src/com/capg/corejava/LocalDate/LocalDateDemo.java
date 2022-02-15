package com.capg.corejava.LocalDate;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		System.out.println(localDate.toString());
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.getDayOfWeek().toString());
	}
}


//O/P
//2021-12-15
//2021
//DECEMBER
//false
//WEDNESDAY
