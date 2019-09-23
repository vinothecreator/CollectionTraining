package com.qspiders.abstractclasses;

abstract class A
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	
	abstract void m2(); //Abstract method
}

class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		B objb=new B();
		objb.m1();
		objb.m2();

	}

}
