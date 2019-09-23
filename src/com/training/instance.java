package com.training;

class A{
	int i=9;
}


public class instance {

	public static void main(String[] args) {

		A obj = new A();
		
		boolean s= obj instanceof A;
		System.out.println(s);
	}

}
