package com.capg.corejava.java8.lambda;

interface Person {
	public void eat(String foodname1, String foodname2);
}

public class Lambdafood {
	public static void main(String[] args) {
		Person per = (foodname1, foodname2) ->{

			{

				System.out.println("Eat fruits and Drinks : " + foodname1 + " with  " + foodname2);
			}
		};
		per.eat("Milk", "Sugar");
	}


}

//O/P
//Eat fruits and Drinks : Milk with  Sugar