package com.cg.practice1;

import java.util.Scanner;

class ownexception extends RuntimeException {
	public ownexception(String message) {
		System.out.println(message);
	}
}
public class VotingCheck {
	Scanner sc = new Scanner(System.in);

	public void checkage() throws ownexception {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if (age < 18) {
			throw new ownexception("Not eligible for vote ");
		} else if (age >= 18) {
			System.out.println("Age is sufficient for vote ");
		} else {
			System.out.println("enter sufficient value ");
		}
	}

	public static void main(String[] args) {
		try {
			VotingCheck check = new VotingCheck();
			check.checkage();
		} catch (ownexception e) {
			System.out.println(e);
		}

	}
}
