package com.capg.corejava.java8.annonamus;

interface person {
	public void eat();
}

public class personImpl {
	public static void main(String[] args) {
		person person = new person() {

			@Override
			public void eat() {
				System.out.println("Eating rich food ");
			}
		};
		person.eat();
	}

}

//o/p
//Eating rich food 