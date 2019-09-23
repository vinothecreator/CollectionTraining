package com.qspiders.abstractclasses;


abstract class X
{
	abstract void m1();
}

abstract class Y extends X
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
	
	abstract void m3();
}

class Z extends Y
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	
	void m3()
	{
		System.out.println("Inside m3 method");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
      Z obj=new Z();
      obj.m1();
      obj.m2();
      obj.m3();
		
		
	}

}
