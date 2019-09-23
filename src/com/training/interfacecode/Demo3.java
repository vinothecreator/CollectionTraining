package com.training.interfacecode;



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

class Z extends Y
{

	public void m2()
	{
		System.out.println("inside m2 method");
	}
}

}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
	}

}
