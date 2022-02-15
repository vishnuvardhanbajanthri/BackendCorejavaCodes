package com.ram.spring.ioc;
	
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 	  
	public class EmployeeTest {
	    public static void main(String[] args) {  
	          
	      
	        
ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
	    	
	    Employee emp=(Employee)factory.getBean("decCon");
	          
	        Employee myEmp=(Employee)factory.getBean("emp");  
	       	        
	        myEmp.display();  
	          
	    }  	}  

 
