package com.training;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int marks = scn.nextInt();
		
		if(marks>=80)
		{
			System.out.println("A Grade");
			System.out.println("Excellent");
			
		}
		else if(marks>=70){
			System.out.println("B Grade");
			System.out.println("Good");
		}
		else if(marks >=60){
			System.out.println("C Grade");
			System.out.println("Average");

		}
		else if(marks>=45){
			System.out.println("D Grade");
			System.out.println("Poor");
		}
		else
		{
		System.out.println("Fail");	
		}
		
	}

}
