package com.cg.samplefornaresh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
 	int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
 	
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder("<");
       sb.append("name: ");
       sb.append(name);
       sb.append(" salary: ");
       sb.append("" + salary+">");
       return sb.toString();

   }
}
class EmployeeInfo
{
   enum SortMethod
	{
		BYNAME, BYSALARY;
   }

   public List<Employee> sort(List<Employee> emps,final SortMethod method){
   	switch(method)
   	{
   	case BYNAME:
   		return emps.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
   	case BYSALARY:
           return emps.stream().sorted( (o1, o2) -> 
   		{
   			if(o1.getSalary() == o2.getSalary())
   			{
   				return o1.getName().compareTo(o2.getName());
   			}
   			else if(o1.getSalary() > o2.getSalary())
   			{
   				return 1;
   			}
   			return -1;
   		}).collect(Collectors.toList());
       }
       return null;
   }
		
	
	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character)
	{
       // Method to check if Employee list contains a name starting with a specific character
       return entities.stream().allMatch(o -> o.getName().contains(character));
	}
}

public class Source5{

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		
		EmployeeInfo ei = new EmployeeInfo();
		System.out.println(ei.sort(emps, EmployeeInfo.SortMethod.BYNAME));
		System.out.println(ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY));
		System.out.println(ei.isCharacterPresentInAllNames(emps, "E"));


	}
}