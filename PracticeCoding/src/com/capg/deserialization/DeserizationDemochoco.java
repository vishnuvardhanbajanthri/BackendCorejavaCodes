package com.capg.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.capg.serializable.ChocolateBean;

public class DeserizationDemochoco {
	public static void main(String[] args) {
		ChocolateBean bean;
		try {
			FileInputStream fileInputStream = new FileInputStream("d:\\capgdata\\chocodemo");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

			while ((bean = (ChocolateBean) inputStream.readObject()) != null) {
				System.out.println(bean);
			}

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
