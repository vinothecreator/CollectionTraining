package com.training.overridding;

class A
{
void test()
{
System.out.println("inside test method of class A");	
}


}


class B extends A

{

	void test() // overridden so old one is over written with new method
	{
		//super.test();
		System.out.println("inside test method of class B");
	}
}


public class Demo {

	public static void main(String[] args) {
	B obj = new B();
	obj.test();
	/*A obj1 = new A(); // if you want old method means create one
	obj1.test();
*/
	}

}
