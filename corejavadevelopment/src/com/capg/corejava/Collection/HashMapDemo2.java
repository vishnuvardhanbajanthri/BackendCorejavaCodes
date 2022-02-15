package com.capg.corejava.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(01, "Hello world");
		hashMap.put(02, "Hii");
		hashMap.put(03, "Vishnu");
		hashMap.put(04, "Vardhan");

		System.out.println(hashMap);

		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println("Key : " + m);
		}

	}
}

//O/P:-
//{1=Hello world, 2=Hii, 3=Vishnu, 4=Vardhan}
//Key : 1=Hello world
//Key : 2=Hii
//Key : 3=Vishnu
//Key : 4=Vardhan
