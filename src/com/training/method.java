package com.training;

public class method {
	
	
	//method with arguments
	static void add(int a, int b)
	{
	/*	
		int a=10; // hardcoded value
		
		int b=2;
		//int sum; */
		
		int sum=a+b;
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
	
		add(6,5);
		add(10,20);
		add(100,200); 

	}

}
