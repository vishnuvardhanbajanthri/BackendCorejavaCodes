package com.capgemini.practice;

interface Book {
	public void BookType();

	public void Bookname();
}

public class Interface1 implements Book {

	@Override
	public void BookType() {
		System.out.println("TestBook");
	}

	@Override
	public void Bookname() {
		System.out.println("JavaBook");
	}

	public static void main(String[] args) {
		Interface1 interface1 = new Interface1();

		interface1.BookType();
		interface1.Bookname();
	}
}
