package com.capg.corejava.oops;

public class Student {
	int sno = 10;
	String name = "vishnu";
	int sub1 = 90;
	int sub2 = 45;
	int sub3 = 75;
	int sub4 = 58;
	int total;
	double obtain;
	double perc;

	public void studentdetails() {
		System.out.println("student sno :" + sno);
		System.out.println("sub1 :" + sub1);
		System.out.println("sub2 :" + sub2);
		System.out.println("sub3 :" + sub3);
		System.out.println("sub4 :" + sub4);
	}

	public void totalmars() {
		total = sub1 + sub2 + sub3 + sub4;
		System.out.println("Total marks :" + total);
	}

	public void percentage() {
		int x = 699;
		int y = 1000;
		double perc = x * 100 / y;
		System.out.println(perc);

	}

	public static void main(String[] args) {
		Student student = new Student();
		student.studentdetails();
		student.totalmars();
		System.out.println();
		student.percentage();
	}
}
