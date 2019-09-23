package com.training;

public class staticvariables {  // members of a class
	
	//Data variables or members
	static int  i=9; // static member
	int j=5;         // non - static
	
	
	//Member methods
	static void m1(){
		System.out.println("staic method");
	}
	
	void m2(){
		System.out.println("Non- static method");
	}
	
	public static void main(String[] args) {
	
		
		// Accesssing static memebers of a class
		System.out.println("i is " +staticvariables.i);
		staticvariables.m1();
		
		// Accesssing Non- static memebers of a class
		
		staticvariables ob= new staticvariables();
		System.out.println(ob.j);
		

	}

}
