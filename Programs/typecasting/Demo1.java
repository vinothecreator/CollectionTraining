package com.qspiders.typecasting;

class Apple
{
	int x;
}

public class Demo1 {

	public static void main(String[] args) {
		
		int i=9;
		
		System.out.println(new Apple().x);

		new Apple().x=87;
		
		Apple ref=new Apple();
		
		Apple ref1=new Apple();
		
	}

}
