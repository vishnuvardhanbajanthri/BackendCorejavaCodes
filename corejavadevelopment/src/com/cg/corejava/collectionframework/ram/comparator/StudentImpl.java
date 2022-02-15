package com.cg.corejava.collectionframework.ram.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentImpl {

	public static void main(String[] args) {
		
		//Creating list of Students
		ArrayList<Student> myStu=new ArrayList<Student>();
		
		 myStu.add(new Student(100,"Ramesh",26));
		 myStu.add(new Student(106,"Mohan",20));
		 myStu.add(new Student(105,"Anu",21));
		 System.out.println("Before Sort..");
		 
		 for(Student stu:myStu)
      	   System.out.println(stu.sno+ " "+stu.sname+" "+stu.age);
		 
		 System.out.println("Sort By Name:");
		 
		  Collections.sort(myStu,new SortByStudentName());
		
           for(Student stu:myStu)
        	   System.out.println(stu.sno+ " "+stu.sname+" "+stu.age);
           
           
           System.out.println("Sort By Age:");
           
           Collections.sort(myStu,new SortByAge());
   		
           for(Student stu:myStu)
        	   System.out.println(stu.sno+ " "+stu.sname+" "+stu.age);
	}

}
