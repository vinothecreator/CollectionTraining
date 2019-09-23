package com.qspiders.interfacedemo;

interface M
{
	void m1();
}
interface N extends M
{
	void m2();
}

class O implements N
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
}


public class Demo4 {

	public static void main(String[] args) {
		
      O obj=new O();
      obj.m1();
      obj.m2();
		
	}

}
