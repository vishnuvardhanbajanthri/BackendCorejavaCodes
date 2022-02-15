package com.cg.bookapp;
//  create table book(bookid int, bookname varchar(20),price double,grade varchar(5));
import java.util.Scanner;

public class BookMainController {

	public static void main(String[] args) throws Exception {
		
		int bookId=0;
	    String title=null;
	    double price;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Bookd Id :");
	    bookId=sc.nextInt();
	    
	    System.out.println("Enter Book Title");
	    title=sc.next();
	    System.out.println("Enter Book Price :");
	    price=sc.nextDouble();
	    
	    BookService bookService=new BookService();
	    
	  int r=  bookService.addBookService(bookId, title, price);
	  
	  System.out.println("Main Controller last return Value from Dao :"+r);

	}

}
