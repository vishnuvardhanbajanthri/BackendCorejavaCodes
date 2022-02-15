package com.capg.datetime;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		System.out.println(date.isLeapYear());
		System.out.println(date.lengthOfMonth());
		
	}
}
