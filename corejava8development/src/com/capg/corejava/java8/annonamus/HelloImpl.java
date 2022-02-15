package com.capg.corejava.java8.annonamus;

interface interduce {
	public void hii();
}

public class HelloImpl {
	public static void main(String[] args) {
		interduce interduce = new interduce() {

			@Override
			public void hii() {
				System.out.println("Hii i am vishnu");
			}
		};
		interduce.hii();
	}
}
