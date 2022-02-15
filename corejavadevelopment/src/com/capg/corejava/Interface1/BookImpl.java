package com.capg.corejava.Interface1;

interface Book {
	public void BookTytle();

	public void BookAuthor();

	public void BookPrice();
}

public class BookImpl implements Book {

	@Override
	public void BookTytle() {
		System.out.println("Core java");
	}

	@Override
	public void BookAuthor() {
		System.out.println("DurgaSir");
	}

	@Override
	public void BookPrice() {
		System.out.println("Rs-2000");
	}

	public static void main(String[] args) {
		BookImpl bookImpl = new BookImpl();
		bookImpl.BookTytle();
		bookImpl.BookAuthor();
		bookImpl.BookPrice();
	}

}
