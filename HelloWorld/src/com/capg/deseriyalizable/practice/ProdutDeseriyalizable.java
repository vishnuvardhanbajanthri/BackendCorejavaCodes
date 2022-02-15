package com.capg.deseriyalizable.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.capg.serializeationdemo.Productbean;

public class ProdutDeseriyalizable {
	public static void main(String[] args) {
		Productbean p;
		try {
			FileInputStream fileInputStream = new FileInputStream("E:\\empdata\\productdata.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

			while ((p = (Productbean) inputStream.readObject()) != null) {
				System.out.println(p);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
