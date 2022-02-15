package com.cg.bookapp;

public class BookService {
	
	public int addBookService(int bookId,String title,double price)throws Exception{
		System.out.println("In Service Layer : "+bookId+title+price);
		
	String grade="";
	
	if(price<=300)
	{
		grade="C";
	}
	else if(price<=600)
	{
		grade ="B";
	}
	else
	{
		grade = "A";
	}
	
	BookBean bookBean=new BookBean();
	bookBean.setBookId(bookId);
	bookBean.setTitle(title);
	bookBean.setPrice(price);
	bookBean.setGrade(grade);
	
	BookDAO bookDAO = new BookDAO();
    int k=  	bookDAO.addBook(bookBean);
	
		return k;
		
	}

}
