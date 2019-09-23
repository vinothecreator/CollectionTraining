package com.typecast;

class A
{
	int i=66;
	void m1()
	{
		System.out.println("Inside m1");
	}
	}

class B extends A
{
	int j =6;
	void m2( ){
		System.out.println("overloaded m1 method");
	}
	}

class C extends B

{
	int k=8;
	void m3()
	{
		System.out.println("Inside m3 method");
	}
	
	{
		
		
	}	
}

public class demo {

	public static void main(String[] args) {
		
		A refa= new B(); // upcast
		
		A refc= new C(); // upcast
		
		A ref=(C)refc;// downcast
		
		System.out.println(ref.i);
	

		
		B refb= (B)refa; // downcasting
		
		System.out.println(refb.i);
		System.out.println(refb.j);
		
		
		
		refb.m1();
		refb.m2();
	




	}

}
