package com.capg.assignment2;

public class LibraryDemo {
	public static void main(String[] args) {
		Person[] p =
				{ new Person(101, "pankaj", 3), new Person(102, "vikas", 2), new Person(103, "vineet", 3),
						new Person(104, "akash", 1), new Person(105, "shalini", 0), new Person(106, "shikha", 1),
						new Person(108, "prateek", 3) };
		int[] booksIssued = getBooksIssued(p);
		int avgBookIssued = findAvgBookIssued(booksIssued);
		System.out.println("Average book issued  :" + avgBookIssued);
	}
	private static int[] getBooksIssued(Person[] persons) {
		int no = 0;
		int k = 0;
		int[] books = new int[7];
		for (Person person : persons) {
			int book = person.getBook();
			books[k++] = book;
		}
		return books;
	}
	private static int findAvgBookIssued(int[] books_issued) {
		int count = 0;
		int no = books_issued.length - 1;
		for (int i : books_issued) {
			int book = i;
			count += book;
		}
		int avg = count / no;
		return avg;
	}
}
