package com.capg.Assignment.Ass1;

import java.util.Scanner;

public class Assignment3 {
	public void Headphone() {
		System.out.println("Sr #     Product Name     MRP     Selling Price      Discount");
		System.out.println("-------------------------------------------------------------");
		System.out.println(" 1        Headphone       500         400                20  ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name");
		String str = sc.next();
		if (str.equals("Headphone")) {
			Assignment3 assignment3 = new Assignment3();
			assignment3.Headphone();
		} else {
			System.out.println("Product not Found ");
		}
	}
}
