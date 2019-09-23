package com.qspiders.overriding;

class M
{
	final void test()
	{
		System.out.println("Inside test method of class M");
	}
	
}
class N extends M
{
	void test()
	{
		System.out.println("Inside test method of class N");
	}
	
}


public class Demo5 {

	public static void main(String[] args) {
		

	}

}
