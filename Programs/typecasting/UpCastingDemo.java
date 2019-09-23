package com.qspiders.typecasting;

/*class A
{
	int i=9;
	
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}

class B extends A
{
	int j=5;
	
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
*/
public class UpCastingDemo {

	public static void main(String[] args) {
	
		A refa=new B();  //Auto Upcast
		
		System.out.println(refa.i);
		refa.m1();
		
	}

}
