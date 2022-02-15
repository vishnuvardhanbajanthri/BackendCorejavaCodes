package com.capg.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerilizationDemo {
	public static void main(String[] args) {
		ProductBean p;

		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("d:\\capgdata\\product.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

			while ((p = (ProductBean) inputStream.readObject()) != null) {
				System.out.println(p);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}
}
