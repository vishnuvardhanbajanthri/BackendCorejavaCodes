package co.capg.collection.practice;

import java.util.Iterator;
import java.util.TreeSet;

import javax.sound.sampled.ReverbType;

public class TreesetDemo  {
	public static void main(String[] args)  {
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Heloo");
		set.add("red");
		set.add("yellow");
		set.add("white");
//		set.add("red");
//		set.add(null);
		set.add("orange");
		
//		for (String string : set) {
//			System.out.println(string);
//		}
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
			
			if(str=="orange") {
				iterator.remove();
			}
		}
		System.out.println("");
		System.out.println(set);
		
	}
}
