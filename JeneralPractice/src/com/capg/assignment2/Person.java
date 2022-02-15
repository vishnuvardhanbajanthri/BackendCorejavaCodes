package com.capg.assignment2;

public class Person {
	int id;
	String name;
	private int book;

	public Person(int id, String name, int book) {
		this.id = id;
		this.name = name;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBook() {
		return book;
	}

}
