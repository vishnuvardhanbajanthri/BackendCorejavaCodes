package com.capg.corejava.Final;

// Final class  can't extend
public class FinalDemo3 {

	final String countryname = "India";

	public void MyData() {

		System.out.println("My country is :" + countryname);
	}

	public static void main(String[] args) {
		FinalDemo3 demo1 = new FinalDemo3();
		demo1.MyData();
	}
}
