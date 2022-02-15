package com.capg.java8.lambda;

public class womenimpl {
	public static void main(String[] args) {
		women women = (String speaking) -> {

			{
				System.out.println("Women : " + speaking);
			}
		};
		women.speak("Cotinuasley speaking ");
	}
}
