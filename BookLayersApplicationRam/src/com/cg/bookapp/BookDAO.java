package com.cg.bookapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {
	
	int i;
	public int addBook(BookBean bookBean) throws ClassNotFoundException, SQLException 
	{
		System.out.println("In BookDAO.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "capgreact2";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "vishnu";	
		
			Class.forName(driver);
			conn = DriverManager.getConnection(url+dbName,userName,password);
			
			String query="insert into book values(?,?,?,?)";	
			
			PreparedStatement pstmt=conn.prepareStatement(query);
			
			//Step :  Set parameters
            pstmt.setInt(1,bookBean.getBookId());
			pstmt.setString(2,bookBean.getTitle());
			pstmt.setDouble(3,bookBean.getPrice());
			pstmt.setString(4,bookBean.getGrade());
			
			int i=pstmt.executeUpdate();
			//System.out.println("Record inserted count :"+i);
							
		return i;
		
	}
	

}
