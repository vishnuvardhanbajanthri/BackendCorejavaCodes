package com.capg.corejava.java8.lambda;

// lambda Code
interface persondemo {
	public void eat();
}

public class Lambdaprog2 {
	public static void main(String[] args) {
		persondemo person = () -> {

			{
				System.out.println("Rich food");

			}
		};
		person.eat();
	}
}

//O/P
//Rich food