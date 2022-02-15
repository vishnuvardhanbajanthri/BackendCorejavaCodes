package com.cg.productapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.cg.bookapp.BookBean;

public class productDAO {
	int i;
	public int addproduct(productbean productbean) throws ClassNotFoundException, SQLException {

		System.out.println("In product DAO : ");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "capgreact2";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "vishnu";

		Class.forName(driver);
		conn = DriverManager.getConnection(url + dbName, userName, password);
		String query = "insert into product values(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query);

		pstmt.setInt(1, productbean.getProdid());
		pstmt.setString(2, productbean.getProdname());
		pstmt.setDouble(3, productbean.getProdprice());
		pstmt.setString(4, productbean.getGrade());

		int i = pstmt.executeUpdate();
		return i;

	}
}
