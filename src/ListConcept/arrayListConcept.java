package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListConcept {

/*	1.Can contain duplicate values
	2.maintain insertion order (0,1,2,3..)
	3.synchronized (Thread safe , its slow as compared to other collection)
	4.allow random access to fetch the element because it stores the values on the basis of indexes getsize(4)- it will 
	display the values*/
	
	
	

	public static  void main(String[] args) {
	
		int a[] = new int[4]; // static array size is fixed

		ArrayList  ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		System.out.println(); 
		
	for(int i=0;i<ar.size();i++){
		System.out.println(ar.get(i));
	}
			
	//Non generic vs generic
	//<integer>, <String> should be mentioned
	
	ArrayList <Integer> ar2= new ArrayList <Integer>();

	ar2.add(20);

	
	//ArrayList<E> ar3= new ArrayList<E>(); // suppose we don't know whether int, string etc ADD "E"
	
	// Employee class objects
	

Employee e1 = new Employee("Varun",28,"QA");
	Employee e2 = new Employee("Tom",28,"Dev");
	Employee e3 = new Employee("Peter",29,"Admin");
	
/*	
	Employee  E1= new Employee(101,"Varun","QA");
	Employee  E2= new Employee(102,"Arjun","DEV");
	Employee  E3= new Employee(103,"Devan","TEST Engineer");*/
	
	

	//create arraylist
	
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	//Iterator to traverse the values
	
	Iterator<Employee> it =ar4.iterator();
	
	while(it.hasNext()){
		Employee emp=it.next();
		System.out.println(emp.name + "  " +emp.age +" "+ emp.dept);
	
	}
	
	
	
	// new employee class
	ArrayList<Employee> ar10 = new ArrayList<Employee>();
	
/*	ar10.add(E1);
	ar10.add(E2);
	ar10.add(E3);*/
	
	/*Iterator <Employee> it = ar10.iterator();
	
	while(it.hasNext()){
	Employee emp=it.next();
	*/
/*	System.out.println(emp.id);
	System.out.println(emp.name);*/
	}
	
	
	
	
	
	
	
/*	
	System.out.println("_______________Blank________");
	
	ArrayList <String> ar6= new ArrayList <String>();
	
	ar6.add("QTP");
	ar6.add("java");
	ar6.add("selenium");
	
	
	ArrayList <String> ar7= new ArrayList <String>();
	
	ar7.add("dev");
	ar7.add("QA");
	ar7.add("Devops");
	
	
	ar6.addAll(ar7);
	
	for(int i=0;i<ar6.size();i++){
		System.out.println(ar6.get(i));
	}
	
	System.out.println("_______________Remove________");

	
	//Remove all
	
	ar6.removeAll(ar7);
	for(int i=0;i<ar6.size();i++){
		System.out.println(ar6.get(i));
	}
	
	System.out.println("_______________Retain________");

	//Retain all 
	
	
	ArrayList <String> ar8= new ArrayList <String>();
	
	ar8.add("QTP");
	ar8.add("java");
	ar8.add("selenium");
	
	
	ArrayList <String> ar9= new ArrayList <String>();
	
	ar9.add("QTP");
	ar9.add("QA");
	ar9.add("Devops");
	
	
	ar8.retainAll(ar9);
	
	for(String z:ar8){
		System.out.println(z);*/

	
	
	}
	
			


