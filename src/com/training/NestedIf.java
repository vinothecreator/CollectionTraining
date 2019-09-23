package com.training;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		
		int techRating = scn.nextInt();
		int commRating = scn.nextInt();

		if (techRating == 5) {
			System.out.println("You have sound tech knowledge");
			if (commRating >= 4) {
				System.out.println("You have good comm skills ");
				System.out.println("You're eligible for interviews ");
			} else { // inner else
				System.out.println("Please improve");
			}
		} else // outer else if tech rating will get fail
		{
			System.out.println(" Please work on your Technical skills");
		}
	}

}
