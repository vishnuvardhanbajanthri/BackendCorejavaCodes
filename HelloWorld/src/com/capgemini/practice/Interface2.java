package com.capgemini.practice;

public class Interface2 implements inter1, inter2 {

	@Override
	public void collegename() {
		System.out.println("Sku");
	}

	@Override
	public void lastname() {
		System.out.println("vardhan");

	}

	@Override
	public void firstname() {
		System.out.println("Vishnu");
	}

	public static void main(String[] args) {
		Interface2 interface2 = new Interface2();
		interface2.collegename();
		interface2.firstname();
		interface2.lastname();
	}

}
