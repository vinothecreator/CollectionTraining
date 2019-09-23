package com.training;

public class students {

	/*
	 * static String empName; // static also same pbm wil occur, we can store
	 * only // one set of values ,so we going to take non- static 
	 * static int
	 * empID; static int salary;
	 */

	String empName;
	int empID;
	int salary;

	public static void main(String[] args) { // we can't able to compare salary
												// of one emp to another emp
												// since both
												// having same name. to avoid

		// this we going to create

		// Non static
		
		
		students s1= new students();
		s1.empName= "shailu";
		s1.empID =100;
		s1.salary=30000;
		
		students s2= new students();
		
		s2.empName= "Divya";
		s2.empID =1003;
		s2.salary=150000;
		
		System.out.println(s1.empID);
		System.out.println(s2.empID);
		// static members in class

		/*
		 * static12.empName = "Ram"; static12.empID = 100; static12.salary =
		 * 10000;
		 * 
		 * static12.empName = "viji"; static12.empID = 100; static12.salary =
		 * 10000;
		 * 
		 * System.out.println(empName); System.out.println(empID);
		 * System.out.println(salary);
		 */

		/*
		 * empName="Raj"; empID= 123; salary=1200;
		 * 
		 * 
		 * System.out.println("Employee name " + empName); System.out.println(
		 * "Employee ID " + empID); System.out.println("Employee salary  " +
		 * salary );
		 */

	}

}
