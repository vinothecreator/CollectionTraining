package com.qspiders.interfacedemo;

class A
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}

interface B
{
	void m2();
}

class C extends A implements B
{
	C()
	{
		super();
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
}


public class Demo5 {

	public static void main(String[] args) {
		
		C obj=new C();

	}

}
