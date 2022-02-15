package com.capg.corejava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationStu {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\capgdata\\product.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			StudentInfoBean bean = new StudentInfoBean(01, "Vishnu", 73.00);
			StudentInfoBean bean2 = new StudentInfoBean(02, "Ramu", 75.00);
			StudentInfoBean bean3 = new StudentInfoBean(03, "Varun", 80.00);
			StudentInfoBean bean4 = new StudentInfoBean(04, "kiran", 90.00);
			System.out.println("Wriiten object into stream ");
			objectOutputStream.writeObject(bean);
			objectOutputStream.writeObject(bean2);
			objectOutputStream.writeObject(bean3);
			objectOutputStream.writeObject(bean4);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
