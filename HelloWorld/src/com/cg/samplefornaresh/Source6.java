package com.cg.samplefornaresh;

import java.util.*;
import java.util.stream.Collectors;
class Candidate
{
	private String name;
	private int id;
	private int age;
	private String gender;
	private String department;
	private int yearofjoining;
	private double salary;
	public Candidate(int id, String name, int age, String gender, String department, int yearofjoining, double salary)
	{
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.yearofjoining = yearofjoining;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofjoining=" + yearofjoining + ", salary=" + salary + "]";
	}
	
}
class Implementation
{
	public static Map<String,Long> getCount(List<Candidate> list)
	{
		//List<Candidate> n = new ArrayList();
		Map<String,Long> MaleFemaleCount = list.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.counting()));
		return MaleFemaleCount;
	}
	public static Map<String,Double> getAverageAge(List<Candidate> list)
	{
		Map<String,Double> averageAge = list.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.averagingInt(Candidate::getAge)));
		return averageAge;
	}
	public static Map<String,Long> countCandidatesDepartmentWise(List<Candidate> list)
	{
		Map<String,Long> countByDepartment = list.stream().collect(Collectors.groupingBy(Candidate::getDepartment,Collectors.counting()));
		return countByDepartment;
	}
	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
	{
		Optional<Candidate> youngestCandidateDetails = list.stream().min(Comparator.comparingInt(Candidate::getAge));
		return youngestCandidateDetails;
	}
}
public class Source6 extends Implementation{

	public static void main(String[] args) {
		List<Candidate> list = new ArrayList<>();
		list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		Source6 s = new Source6();
		System.out.println(getCount(list));
		System.out.println(getAverageAge(list));
		System.out.println(countCandidatesDepartmentWise(list));
		System.out.println(getYoungestCandidateDetails(list));
	}

}