package com.cg.productapp;

import java.sql.SQLException;

public class productservice {

	public int addproductsevice(int prodid, String prodname, double prodprice) throws ClassNotFoundException, SQLException {

		String grade = " ";

		if (prodprice <= 30000) {
			grade = "C";
		} else if (prodprice <= 60000) {
			grade = "B";
		} else {
			grade = "A";
		}

		productbean productbean = new productbean();
		productbean.setProdid(prodid);
		productbean.setProdname(prodname);
		productbean.setProdprice(prodprice);
		productbean.setGrade(grade);
		
		productDAO dao=new productDAO();
		
		int k=dao.addproduct(productbean);
		
		return k;

	}

}
