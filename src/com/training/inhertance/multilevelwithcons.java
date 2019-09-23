package com.training.inhertance;

class A

{

	int i;

	A() {
		System.out.println("A class");
	}

}

class B extends A {

	int j;

	B(int x) {
		System.out.println("B class cons");
	}
}

class C extends B

{

	int k;

	C() {

		super(6);
		System.out.println("C class con");
	}
}

public class multilevelwithcons {

	public static void main(String[] args) {

		C obj = new C();

	}

}
