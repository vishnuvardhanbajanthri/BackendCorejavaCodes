package com.capg.corejava.oops;

public class Userlogin {
	public void login(String name, String pass) {
		System.out.println("username :" + name);
		System.out.println("Password :" + pass);
	}

	public void login(int mobile, String pass) {
		System.out.println("MobileNumber :" + mobile);
		System.out.println("Password :" + pass);
	}

	public void login(String name, String pass, String capcha) {
		System.out.println("username :" + name);
		System.out.println("Password :" + pass);
		System.out.println("Captcha :" + capcha);
	}

	public static void main(String[] args) {
		Userlogin userlogin = new Userlogin();
		userlogin.login("Hello", "Hello@123");
		System.out.println();
		userlogin.login(485798, "Hello@123");
		System.out.println();
		userlogin.login("hiii", "Hello", "Vis@%$");
	}
}
