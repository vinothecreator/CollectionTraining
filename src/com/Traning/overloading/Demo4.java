package com.Traning.overloading;

class X
{
	
void m1()
{
	System.out.println("inside m1");
	}
void m1(int a)
{
	System.out.println("inside m1 method with an int arg");
	
	}
}
class Y extends X
{

	void m1(double d)
	{
		System.out.println("inside m1 method wiht class Y");
	}

}


public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
