package com.training.interfacecode;

interface p
{

 void m1(); //	public abstract - default will be there
 
	
}

class B implements p
{
	
 public void m1() //overriding - method should be same so we using public keyword 
{
	System.out.println("m1 implemented");
	}
	}


public class Demo2 {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.m1();

	}

}
