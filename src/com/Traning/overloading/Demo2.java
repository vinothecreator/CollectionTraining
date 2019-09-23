package com.Traning.overloading;


// non static method
class sample  // both static and non static method overloaded
{
	static void test()
	{
		System.out.println("inside no args");
	}
	static void test(int a)
	{
		System.out.println("inside int args");
	}
	
	static void test(double a)
	{
		System.out.println("inside double args");
	}
	
	}

public class Demo2 {

	public static void main(String[] args) {
		
		sample.test();
		sample.test(6.5);

	}

}
