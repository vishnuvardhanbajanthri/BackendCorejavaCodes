package com.capg.corejava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilizationmobiledemo {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("d:\\capgdata\\mobile.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			Mobilebean mobilebean=new Mobilebean(100, "redmi", 20000);
			Mobilebean mobilebean2=new Mobilebean(102, "samsung", 30000);
			Mobilebean mobilebean3=new Mobilebean(04, "vivo", 25000);
			
			System.out.println("writting object into the stream ");
			objectOutputStream.writeObject(mobilebean);
			objectOutputStream.writeObject(mobilebean2);
			objectOutputStream.writeObject(mobilebean3);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
