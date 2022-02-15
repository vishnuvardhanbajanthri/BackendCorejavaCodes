package com.capg.corejava.Interface1;

// we can't create object to interface but we  create object to reference to interface
interface Book1 {
	public void bookTitle();

	public void bookAuthor();

	public void bookPrice();
}

public class BookImpl2 implements Book1 {

	@Override
	public void bookTitle() {
		System.out.println("This is java Book");
	}

	@Override
	public void bookAuthor() {
		System.out.println("Author is Ramkumar sir ");
	}

	@Override
	public void bookPrice() {
		System.out.println("Price is 1000 Rs");
	}

	public void display() {
		System.out.println("LocalMethod ");    // we can not call local methods by Interface object reference rather than we create object with particular class name 
	}

	public static void main(String[] args) {
		Book1 book1 = new BookImpl2();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
	}

}


//o/p
//This is java Book
//Author is Ramkumar sir 
//Price is 1000 Rs
