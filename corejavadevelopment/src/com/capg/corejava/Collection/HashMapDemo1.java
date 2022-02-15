package com.capg.corejava.Collection;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("India", "Delhi");
		hashMap.put("USA", "WashingTon Dc");
		hashMap.put("Andhra Pradesh", "Amaravathi");

		System.out.println(hashMap);

		for (String string : hashMap.keySet()) {
			System.out.println(string);
		}
		System.out.println("");
		for (String string : hashMap.values()) {
			System.out.println(string);
		}

	}
}

//O/p:-
//{USA=WashingTon Dc, Andhra Pradesh=Amaravathi, India=Delhi}
//USA
//Andhra Pradesh
//India
//
//WashingTon Dc
//Amaravathi
//Delhi
