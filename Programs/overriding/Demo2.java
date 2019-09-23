package com.qspiders.overriding;

class Employee
{
	String fname;
	String lname;
	
	void printDetails()
	{
		System.out.println("FirstName is "+fname);
		System.out.println("LastName is "+lname);
	}
}

class Manager extends Employee
{
	String dept;
	int teamSize;
	
	void printDetails()
	{
		super.printDetails();
		System.out.println("Department is "+dept);
		System.out.println("Team size is "+teamSize);
	}
	
}


public class Demo2 {

	public static void main(String[] args) {
		
		Manager m1=new Manager();
		m1.fname="Priya";
		m1.lname="Rami";
		m1.dept="Accounts";
		m1.teamSize=7;
		
		m1.printDetails();

	}

}
