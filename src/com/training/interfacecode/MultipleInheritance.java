package com.training.interfacecode;

interface A {

	void m1();
}

interface B {
	void m2();
}

class C implements A, B // multiple inheritance achieved
{

	
	C()
	{
		// no use for super statement because A and B are not classes
		
	}
	
	
	public void m1() {

		System.out.println("m1");

	}

	public void m2() {

		System.out.println("m2");
	}

	

	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		C obj = new C();

	}

}
