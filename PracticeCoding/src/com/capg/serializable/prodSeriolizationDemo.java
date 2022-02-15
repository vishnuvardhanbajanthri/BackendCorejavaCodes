package com.capg.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class prodSeriolizationDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\capgdata\\product1.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			ProductBean bean = new ProductBean(100, "Pen", 45);
			ProductBean bean2 = new ProductBean(200, "Book", 50);
			ProductBean bean3 = new ProductBean(105, "Pencil", 20);

			System.out.println("writting object into Stream");

			objectOutputStream.writeObject(bean);
			objectOutputStream.writeObject(bean2);
			objectOutputStream.writeObject(bean3);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
