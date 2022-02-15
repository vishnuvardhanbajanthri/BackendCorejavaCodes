package com.capg.corejava.exception;

class productnotfoundexception extends RuntimeException {
	productnotfoundexception(String message) {
		System.out.println("Hello :" + message);
	}
}

public class ProductDefineException {
	int pro = 10;
	public void checkdata() throws productnotfoundexception {
		if (pro < 100) {
			throw new productnotfoundexception("Products not found");
		} else {
			System.out.println("Products are there ");
		}
	}

	public static void main(String[] args) {
		try {
			ProductDefineException defineException = new ProductDefineException();
			defineException.checkdata();
		} catch (productnotfoundexception e) {
			System.out.println("I will handile " + e);
		}

	}
}
