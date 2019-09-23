package com.training;

public class exception {

	public static void main(String[] args) {
	
		int i=5;
		int j=6;
		int res=0;
		
		int s=0;
		
		try
		{
			System.out.println("Inside try block");
		     
			res= i/j; // Abnormal condition  > thrown out of try block " new exception()" implied class, ref var "e"
			s= Integer.parseInt("test");
			System.out.println(" exit the try block "); // Remaining statements  wont execute once the exception is happens
			
		}
		catch(Exception ref) // specific exception "Arithmetic exception" predefined exception
		{
			System.out.println("inside catch block");
		}
		System.out.println("Result is " +s);

	}

}
