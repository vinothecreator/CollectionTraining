package com.qspiders.overriding;


class A
{
	void test()
	{
		System.out.println("Inside test method of class A");
	}
}

class B extends A
{
	void test() //Overdidden method
	{
		System.out.println("Inside test method of class B");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
       B obj=new B();
	   obj.test();
		
	}

}
