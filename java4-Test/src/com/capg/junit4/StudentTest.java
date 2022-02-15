package com.capg.junit4;

import static org.junit.Assert.assertEquals;

public class StudentTest {
	public void testRollNo() {
		Student student = new Student(101, "Vishnu", "Vardhan");
		assertEquals(student.getRollno(), 101);
	}

	public void testFirstName() {
		Student student = new Student(101, "Vishnu", "Vardhan");
		assertEquals(student.getFirstname(), "Vishnu");
	}
	
	public void testLastName() {
		Student student = new Student(101, "Vishnu", "Vardhan");
		assertEquals(student.getLastname(), "Vardhan");
	}
}
