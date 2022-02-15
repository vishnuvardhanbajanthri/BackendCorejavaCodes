package com.capg.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemosta {
	public static void main(String[] args) {
		StationaryBeen s;
		try {
			FileInputStream fileInputStream=new FileInputStream("d:\\capgdata1\\sta.txt");
			ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
			
			while ((s=(StationaryBeen)inputStream.readObject())!=null) {
				System.out.println(s);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}
}
