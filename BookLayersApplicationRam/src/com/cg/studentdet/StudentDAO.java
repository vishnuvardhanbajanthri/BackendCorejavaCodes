package com.cg.studentdet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
	int i;
	public int  addstudent(StudentBean bean) throws ClassNotFoundException, SQLException {
		System.out.println("In StudentDAO");
		java.sql.Connection  conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="capgreact2";
		String driver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="vishnu";
		
		Class.forName(driver);
		conn=DriverManager.getConnection(url+dbname,userName,password);
		String query="insert into student2 values(?,?,?,?)";
		
		PreparedStatement pstmt=conn.prepareStatement(query);
		pstmt.setInt(1,bean.getStuid());
		pstmt.setString(2, bean.getStuname());
		pstmt.setDouble(3, bean.getStuperc());
		pstmt.setString(4, bean.getGrade());
		
		i=pstmt.executeUpdate();
		return i;
		
	}
}
