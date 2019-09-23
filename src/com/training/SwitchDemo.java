package com.training;

public class SwitchDemo {

	public static void main(String[] args) {

		char grade = 'F';
		switch (grade) {

		case 'A':
			System.out.println("You're Excellent");
			break;

		case 'B':
			System.out.println("You are good");
			break;

		case 'C':
			System.out.println("you are average");
			break;

		default:
			System.out.println("Invalid grade");

		}

	}

}
