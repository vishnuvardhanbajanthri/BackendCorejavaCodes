package com.cg.samplefornaresh;

import java.util.Scanner;

public class Sample {

	enum module1 {
		s1, s2, s3, s4, s5, s6, s7
	};

	public static void main(String[] args) {
		String module = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=====================");
			System.out.println("Welcome to find Student details");
			System.out.println("======================");
			System.out.println("enter your student id  : ");

			module = sc.nextLine();
			

			switch (module1.valueOf(module)) {
			case s1:
				System.out.println("Student name is Ramesh");
				System.out.println("Studying 9th class ");
				break;
			case s2:
				System.out.println("Student name is Vishnu");
				System.out.println("Studying 4th class ");
				break;
			case s3:
				System.out.println("Student name is Naresh");
				System.out.println("Studying 1st class ");
				break;
			case s4:
				System.out.println("Student name is vasu");
				System.out.println("Studying 3rd class ");
				break;
			case s5:
				System.out.println("Student name is Ramkumar");
				System.out.println("Studying 5th class ");
				break;
			case s6:
				System.out.println("Student name is kirankumar");
				System.out.println("Studying 12th class ");
				break;

			default:
				System.out.println("U enter details Not exist please enter valid details");
				break;
			}

		}
	}
}
