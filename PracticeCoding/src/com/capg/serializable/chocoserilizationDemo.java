package com.capg.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class chocoserilizationDemo {

	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\capgdata\\chocodemo");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			ChocolateBean bean = new ChocolateBean(5, "Five-Star", 10);
			ChocolateBean bean2 = new ChocolateBean(10, "Milkey Bar", 20);
			ChocolateBean bean3 = new ChocolateBean(2, "Dairy Milk ", 50);

			System.out.println("writting object into stream ");

			objectOutputStream.writeObject(bean);
			objectOutputStream.writeObject(bean2);
			objectOutputStream.writeObject(bean3);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
