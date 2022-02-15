package com.capg.deseriyalizable.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.zip.InflaterInputStream;

import com.capg.serializeationdemo.Employeebean;

public class Employeedeseriyalizable {
	public static void main(String[] args) {
		Employeebean emp;
		try {
			FileInputStream fileInputStream=new FileInputStream("E:\\empdata\\employedata.txt");
			ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
			
			while ((emp=(Employeebean)inputStream.readObject()) != null) {
				System.out.println(emp);
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
