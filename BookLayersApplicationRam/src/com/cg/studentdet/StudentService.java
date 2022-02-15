package com.cg.studentdet;

import java.sql.SQLException;

public class StudentService {

	public int addStudentService(int stuid, String stuname, double stuperc) throws ClassNotFoundException, SQLException {
		System.out.println("In Service layer : " + stuid + stuname + stuperc);
		String grade = " ";
		if (stuperc < 60) {
			grade = "C";
		} else if (stuperc < 70) {
			grade = "B";
		} else {
			grade = "A";
		}

		StudentBean bean = new StudentBean();
		bean.setStuid(stuid);
		bean.setStuname(stuname);
		bean.setStuperc(stuperc);
		bean.setGrade(grade);

		StudentDAO dao=new StudentDAO();
		int k= dao.addstudent(bean);
		return k;
		
	}
}
