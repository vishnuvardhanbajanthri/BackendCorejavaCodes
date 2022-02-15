package com.capg.java8.ananamusclass;

public class Dogimpl {
	public static void main(String[] args) {
		Dogdemo dogdemo=new Dogdemo() {
			
			@Override
			public void eat() {
				System.out.println("Dog is eating ");
			}
		};
		dogdemo.eat();
	}
}
