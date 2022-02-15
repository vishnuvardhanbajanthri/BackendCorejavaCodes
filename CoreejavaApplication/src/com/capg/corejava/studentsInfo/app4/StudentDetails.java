package com.capg.corejava.studentsInfo.app4;

public class StudentDetails extends School implements StudentInformation {
	int studentid;
	String name;
	String adress;

	public void schoolAdress() {
		System.out.println("School adress Tower clock Anantapur");
	}

	public void Studentinfo(int studentid, String name) {
		this.studentid = studentid;
		this.name = name;

	}

	public void Studentadress(String adress) {
		this.adress = adress;
	}

	public void Studentdetails() {
		System.out.println("Student Id :" + studentid);
		System.out.println("Student name :" + name);
		System.out.println("Student adress " + adress);
	}

	public void display() {
		System.out.println("Subclass");
	}

	public static void main(String[] args) {

		try {
			StudentDetails details = new StudentDetails();
			details.schoolAdress();
			details.Studentinfo(101, "Ramu");
			details.Studentadress("Anantapur, Andhra Pradesh");
			details.Studentdetails();
			details.display();
			University university = new University();
			University university2 = new University("Sk University");
			University.Universityrools();
		} catch (Exception e) {
			System.out.println("I can Handile " + e);
		}

	}
}
