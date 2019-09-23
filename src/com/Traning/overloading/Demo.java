package com.Traning.overloading;


// non static method s

class A
{
	int i;
	
	 void add(int a, int b)
	{
		 
		System.out.println(a+b);
	}
	
	 void add(int a, double b)
	 {
			System.out.println(a+b);
	}
	
	}



public class Demo {

	public static void main(String[] args) {
	
		A obj = new A();
		obj.add(10, 12.5);

	}

}
