package com.training.polymor;

/*Run -time polymorphism
 * IS-A relationship is must
 * Method Overriding
 * Upcasting - same method with different implementation , different objects here to the same reference variable
 */

class A {
	void m() {
		System.out.println("inside m of class A");
	}

}

class B extends A {
	void m() {
		System.out.println("inside m of class B");
	}

	void test() {
		System.out.println("test accesible ");
	}

}

class c extends B {
	void m() {
		System.out.println("inside m of class c");
	}
}

class sample {
	static void demo(A ref) {
		ref.m(); // depends upon object, subclass obj is accessible in upcast,
					// special case only over ridden method
		// ref.test();
	}
}

public class demo2 {

	public static void main(String[] args) {
		// sample.demo(new c()); // only for over ridden method in upcast, sub
		// class method still accessible

		sample.demo(new B());
		sample.demo(new c());

	}

}
