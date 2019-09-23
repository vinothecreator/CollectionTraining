package com.training;

import org.omg.Messaging.SyncScopeHelper;

public class assign2Method {

	// 1. Write a program to perform arithmetic
	// operations(Addition,subtraction,multiplication,division), with each
	// operation in a separate method.

	static int add(int a, int b) {

		int sum = a + b; // we should use return
		return sum;

	}

	static int sub(int a, int b) {

		int sub = a - b; // we should use return
		return sub;

	}

	static int mul(int a, int b) {

		int mul = a * b; // we should use return
		return mul;

	}

	static int div(int a, int b) {

		int div = a / b; // we should use return
		return div;

	}

	public static void main(String[] args) {

		int Res1 = add(10, 6);
		System.out.println("Result will be " + Res1);

		int Res2 = sub(10, 60);
		System.out.println("Result will be " + Res2);

		int Res3 = mul(20, 6);
		System.out.println("Result will be " + Res3);

		int Res4 = div(48, 6);
		System.out.println("Result will be " + Res4);

	}

}
