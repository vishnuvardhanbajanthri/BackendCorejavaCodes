package com.capg.java8.ananamusclass;

public class Manimpl {
	public static void main(String[] args) {
		ManDemo demo = new ManDemo() {

			@Override
			public void walking() {
				System.out.println("man is walking from long time ");
			}
		};
		demo.walking();
	}

}
