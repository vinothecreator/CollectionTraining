package com.training.interfacecode;

class K {

	void m1() {
		System.out.println("Inside m1");
	}

	interface B {
		void m2();

	}

	class C extends K implements B // possible for multiple inheritance
	{
		C() {
			super();
		}

		public void m2() {

			System.out.println("m2 method");
		}
	}

}

public class InterClass {

	public static void main(String[] args) {

		C obj = new C();
		
	

	}

}
