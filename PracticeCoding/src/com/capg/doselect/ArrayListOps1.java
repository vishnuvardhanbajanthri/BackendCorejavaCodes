package com.capg.doselect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListOps1 {

	public List makeArrayListInt(int n) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			arrayList.add(0);
		}
		return arrayList;
	}

	public List reverseList() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		Collections.reverse(arrayList);
		return arrayList;
	}

	public List changeList(ArrayList<Integer> list, int m, int n) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		ListIterator<Integer> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if (next.equals(m)) {
				iterator.set(n);
			}
		}
		Collections.reverse(arrayList);
		return arrayList;
	}

	public static void main(String[] args) {
		ArrayListOps1 demo = new ArrayListOps1();
		demo.makeArrayListInt(4);
		demo.reverseList();
		demo.changeList(null, 28, 20);
	}

}
