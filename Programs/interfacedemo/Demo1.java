package com.qspiders.interfacedemo;

 interface MyInterface {
	
	 final static int x=8;

     public abstract void test();
	
}

 class Demo1
{
	public static void main(String[] args) {
		
		MyInterface obj=new MyInterface();//error- cannot create an object for an interface
		
	}
}