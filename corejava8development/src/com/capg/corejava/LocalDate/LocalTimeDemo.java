package com.capg.corejava.LocalDate;

import java.time.LocalDateTime;

public class LocalTimeDemo {
	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.toString());
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getNano());
	}

}

//O/P
//2021-12-15T18:07:11.611
//15
//7
//WEDNESDAY
//572000000