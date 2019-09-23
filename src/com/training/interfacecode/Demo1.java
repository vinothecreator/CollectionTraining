package com.training.interfacecode;
 interface Myinterface {
	 
	
	final static int x=0;

	public abstract void test(); // complier will treat us abstract only-
									// default as abstract or public abstract

}

public class Demo1
{
public static void main(String args[])
{
	Myinterface obj= new Myinterface();// error- cannot create obj for an interface
	
	
	
	}
}