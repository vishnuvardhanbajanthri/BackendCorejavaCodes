package com.capg.doselect;

import java.util.*;

class ArrayListOps {

	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			l.add(0);

		}
		return l;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		return list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		int l = list.size();
		for (int i = 0; i < l; i++) {
			if (list.get(i) == m) {
				list.set(i, n);
			}
		}
		return list;
	}

}

	public class Source {
	public static void main(String[] args) {
		ArrayListOps obj = new ArrayListOps();
		// ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33,
		// 28, 10, 12));
		// System.out.println(obj.makeArrayListInt(4));
		// System.out.println(obj.reverseList(list));
		// System.out.println(obj.changeList(list,25,28));

	}

}
