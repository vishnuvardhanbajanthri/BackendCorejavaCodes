package com.cg.practice;

class riding{
	public void name1() {
		System.out.println("Vishnu");
	}
	public void name1(int i) {
		System.out.println("Ramu");
	}
	public void name1(int i , int j) {
		System.out.println("kiran");
	}
	public int name() {
		System.out.println("hello");
		return 0;
	}
}



public class overriding extends riding{
	
	public void name1() {
		System.out.println("Vishnu vardhan");
	}
	
	public static void main(String[] args) {
		overriding overriding=new overriding();
		overriding.name1();
		riding riding=new riding();
		riding.name1(); 
		
	}
}
