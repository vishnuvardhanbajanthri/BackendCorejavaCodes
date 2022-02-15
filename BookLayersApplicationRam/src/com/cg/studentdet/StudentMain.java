package com.cg.studentdet;
import java.sql.SQLException;
// create table student(Studentid int,studentname varchar(15),studentpercentage float(7,2),studentgrade varchar(5));
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int stuid = 0;
		String stuname = null;
		double stuperc;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stuid :");
		stuid = sc.nextInt();
		System.out.println("Enter the stuname :");
		stuname = sc.next();
		System.out.println("Enter the Student percentage :");
		stuperc = sc.nextDouble();

		StudentService service = new StudentService();
		int r = service.addStudentService(stuid, stuname, stuperc);
		System.out.println("Main Controller last return values from Dao :" + r);

	}
}
