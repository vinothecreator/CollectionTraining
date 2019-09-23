package com.qspiders.interfacedemo;


interface X
{
	void m1();
	void m2();
}

abstract class Y implements X
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	
}

class Z extends Y
{
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
}



public class Demo3 {

	public static void main(String[] args) {
		
       Z obj=new Z();
       obj.m1();
       obj.m2();
		
	}

}
