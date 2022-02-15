package com.cg.productapp;

// create table product(productid int,productname varchar(15),productprice float(7,2),productgrade varchar(5));

import java.sql.SQLException;
import java.util.Scanner;

public class productmain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int prodid;
		String prodname;
		double prodprice;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product Id");
		prodid = sc.nextInt();
		System.out.println("Enter the product Name");
		prodname = sc.next();
		System.out.println("Enter the product price");
		prodprice = sc.nextDouble();

		productservice productservice = new productservice();
		int r = productservice.addproductsevice(prodid, prodname, prodprice);
		System.out.println("main controller last return values from dao :" + r);
	}

}
