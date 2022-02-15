package com.ram.spring.ioc;
public class EmployeeAddress {
 	private String city;  
	private String state;  
	private String country;  
	  
	public EmployeeAddress() {
		 
	}
	
	public EmployeeAddress(String city, String state, String country) {  
	      
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
	  
	public String toString(){  
	    return city+" "+state+" "+country;  
	}  
}
