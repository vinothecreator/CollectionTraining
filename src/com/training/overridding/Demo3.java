package com.training.overridding;
class X
{
	void m1()
	{
		System.out.println("Inside m1 with no args");
	}
	
}

class Y extends X
{

	void m1() // overridden method
	{
		System.out.println("Inside m1 with no args of class y");
	}

	void m1(int a ) // overloaded method
	{
		System.out.println("inside m1 with an int arg of class Y");
	}
}


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
