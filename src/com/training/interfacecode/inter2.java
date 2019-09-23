package com.training.interfacecode;

interface L {
	void w();
}

class P {

	void w1() {
		System.out.println("w1 implemented");
	}

}

class E extends P implements L {

	public void w() {
		System.out.println("w implemented");
	}

}

public class inter2 {

	public static void main(String[] args) {

		E obj = new E();
		obj.w();
		obj.w1();

	}
}
