//package com.qspiders.abstractclasses;


abstract class Sample
{
	//Concrete method
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	
	abstract void m2(); //Abstract method
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		Sample obj=new Sample(); //Error- cannot create an object for an abstract class

	}

}
