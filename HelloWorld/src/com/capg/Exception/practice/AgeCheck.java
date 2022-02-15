package com.capg.Exception.practice;

import java.util.Scanner;

class Agenotsuupot extends Exception{
	public Agenotsuupot(String message) {
		System.out.println("Your age is not supported ");
	}
}

public class AgeCheck  {
	Scanner sc=new Scanner(System.in);
	
	public void checkage() throws Agenotsuupot {
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		if(age<18) {
			new Agenotsuupot("vishnu ");
		}
		else if (age>=18) {
			System.out.println("You are eligible to vote ");
		}
		else {
			System.out.println("Please enter your age ");
		}
	}
	
	public static void main(String[] args) throws Agenotsuupot {
		AgeCheck ageCheck=new AgeCheck();
		ageCheck.checkage();
	}
}
