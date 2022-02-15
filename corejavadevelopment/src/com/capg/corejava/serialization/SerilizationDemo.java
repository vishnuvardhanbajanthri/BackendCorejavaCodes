package com.capg.corejava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\capgdata\\product.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			ProductBean bean = new ProductBean(101, "Mobile", 20000.00);
			ProductBean bean2 = new ProductBean(102, "Laptop", 50000.00);
			ProductBean bean3 = new ProductBean(103, "Book", 100.00);
			ProductBean bean4 = new ProductBean(104, "Mouse", 500.00);
			System.out.println("Writting object into stream");
			objectOutputStream.writeObject(bean);
			objectOutputStream.writeObject(bean2);
			objectOutputStream.writeObject(bean3);
			objectOutputStream.writeObject(bean4);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
