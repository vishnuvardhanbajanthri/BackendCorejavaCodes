package com.capg.serializeationdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class seriyalizableproduct {

	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\empdata\\productdata.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Productbean productbean = new Productbean("mobile", 45872, "Samsung");
			Productbean productbean2 = new Productbean("Laptop", 50000, "Acer");
			Productbean productbean3 = new Productbean("Tv", 45879, "LG");
			Productbean productbean4 = new Productbean("fan", 20000, "usha");
			System.out.println("Writing object into stream");

			objectOutputStream.writeObject(productbean);
			objectOutputStream.writeObject(productbean2);
			objectOutputStream.writeObject(productbean3);
			objectOutputStream.writeObject(productbean4);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
