package com.capg.corejava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemoSta {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("d:\\capgdata1\\sta.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			StationaryBeen been = new StationaryBeen("Book", 50);
			StationaryBeen been2 = new StationaryBeen("Pen", 20);
			StationaryBeen been3 = new StationaryBeen("Bag", 500);
			System.out.println("Wriiten input into stream");
			objectOutputStream.writeObject(been);
			objectOutputStream.writeObject(been2);
			objectOutputStream.writeObject(been3);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
