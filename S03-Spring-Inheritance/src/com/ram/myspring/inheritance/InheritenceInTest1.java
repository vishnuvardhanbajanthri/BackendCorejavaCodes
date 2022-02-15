package com.ram.myspring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class InheritenceInTest1 {
 
 public static void main(String[] args) {
  ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
  Employee emp=(Employee) appContext.getBean("employeeBean");
  
  System.out.println("Employee name:"+emp.getName());
  System.out.println("Employee number:"+emp.getEmployeeNumber());
  
 }
}