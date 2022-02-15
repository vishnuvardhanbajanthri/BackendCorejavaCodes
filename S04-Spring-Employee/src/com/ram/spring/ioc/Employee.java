package com.ram.spring.ioc;
import java.io.Serializable;
public class Employee implements Serializable {
	 
		private int id;  
		private String name; 
		
		private EmployeeAddress address;  
		  
		public Employee() 
		{System.out.println("Default Constructor");}  
		  
		public Employee(int id, String name, EmployeeAddress address) {  
		      
		    this.id = id;  
		    this.name = name;  
		    this.address = address;  
		}  
		  
		public void display(){  
		    System.out.println(id+" "+name);  
		    System.out.println(address.toString());  
		}  
		  
		}  

