package com.qspiders.overriding;


class X
{
	void m1()
	{
		System.out.println("Inside m1 method with no args of class X");
	}
}

class Y extends X
{
	void m1()  //Overridden method
	{
		System.out.println("Inside m1 method with no args of class Y");
	}
	
	void m1(int a) //Overloaded method
	{
		System.out.println("Inside m1 method with an int arg of class Y");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		

	}

}
