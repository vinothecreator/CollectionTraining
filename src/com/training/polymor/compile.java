package com.training.polymor;

class Addition {
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	void add(double a, int b) {
		double sum = a + b;
		System.out.println(sum);
	}

}

public class compile {

	public static void main(String[] args) {

		Addition obj = new Addition();
		/*
		 * Binding of the method signature with this body at the time of
		 * complication by the complier based on the argu Method overloading is
		 * an example for compile time
		 */

		obj.add(13, 3);
		obj.add(6.5, 8);

	}

}
