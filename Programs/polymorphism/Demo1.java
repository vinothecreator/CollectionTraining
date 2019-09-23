package com.qspiders.polymorphism;

class A
{
	void m1()
	{
		System.out.println("Inside m1 method of class A");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method of class B");
	}
}

class Sample
{
	static void demo(A a)
	{
		a.m1();
	}
}


public class Demo1 {

	public static void main(String[] args) {
		
		Sample.demo(new A());
		

	}

}
