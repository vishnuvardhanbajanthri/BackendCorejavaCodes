package com.capg.corejava.exception;

class AgeNotSuuportException extends Exception {

	AgeNotSuuportException(String message) {
		System.out.println("Hello :" + message);
	}
}

public class UserDefinedException {
	int age = 15;

	public void checkData() throws AgeNotSuuportException {
		if (age < 18) {
			new AgeNotSuuportException("Your are Not eligible");
		} else {
			System.out.println("Hello : You are eligible ");
		}
	}

	public static void main(String[] args) {
		UserDefinedException definedException = new UserDefinedException();
		try {
			definedException.checkData();
		} catch (AgeNotSuuportException e) {
			e.printStackTrace();
		}
	}
}
