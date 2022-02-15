package com.capg.corejava.Final;

// Final Variable we can't change
public class FinalDemo1 {

	final String countryname = "India";

	public void MyData() {
		//    countryname="America";      //Error 
		System.out.println("My country is :" + countryname);
	}

	public static void main(String[] args) {
		FinalDemo1 demo1 = new FinalDemo1();
		demo1.MyData();
	}
}
