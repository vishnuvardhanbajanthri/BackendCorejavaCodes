package com.capg.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizationStuDemo {

	static StudentInfoBean s;

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("d:\\capgdata\\product.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

			while ((s = (StudentInfoBean) inputStream.readObject()) != null) {
				System.out.println(s);
			}

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
