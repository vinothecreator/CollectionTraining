package com.training;

import java.util.Scanner;

public class palin {

	public static void main(String[] args) {
	/*
		int n=4263;
		int temp = n;
		int sum=0;
		int r;

		while(n>0)
		{
			 r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp){
			System.out.println("palindrome");
		}*/
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int temp=num;
		int rev= 0;
		
		while(num!=0)
		{
			rev= rev*10 +num%10;
			num =num/10;
			
		}
		System.out.println(rev);
		if( rev==temp){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
	
	
	
	
	

}
