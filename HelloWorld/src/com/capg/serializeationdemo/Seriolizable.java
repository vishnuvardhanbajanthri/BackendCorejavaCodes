package com.capg.serializeationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seriolizable {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\empdata\\employedata.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Employeebean employeebean = new Employeebean(50, "Ramu", 86954);
			Employeebean employeebean2 = new Employeebean(457, "Vamsi", 84759);
			Employeebean employeebean3 = new Employeebean(57, "Kiran", 75849);
			Employeebean employeebean4 = new Employeebean(427, "sarath", 756894);
			System.out.println("Writting object information");
			objectOutputStream.writeObject(employeebean);
			objectOutputStream.writeObject(employeebean2);
			objectOutputStream.writeObject(employeebean3);
			objectOutputStream.writeObject(employeebean4);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
