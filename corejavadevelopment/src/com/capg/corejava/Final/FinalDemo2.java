package com.capg.corejava.Final;
//  Final method can not overriden
class Test{
	final public void name1() {
		System.out.println("Vishnu");
	}
}


public class FinalDemo2 extends Test {
//	public void name1() {
//		System.out.println("Vishnu vardhan");// we can't override
//	}
	public static void main(String[] args) {
		FinalDemo2 demo2=new FinalDemo2();
		demo2.name1();
	}
}

//o/p
//Vishnu