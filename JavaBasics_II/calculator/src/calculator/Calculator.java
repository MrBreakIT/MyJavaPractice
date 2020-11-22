package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// 1- input numbers and operator from user
		// 2- take result variable and initialize to 0
		// 3- switch based on operator

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 1st number, enter operator, then enter 2nd number.");
		double num1 = input.nextDouble();
		char operator = input.next().charAt(0);
		double num2 = input.nextDouble();

//		System.out.println("Enter first number: ");
//		double num1 = input.nextDouble();
//
//		System.out.println("Enter operator: ");
//		char operator = input.next().charAt(0);
//
//		System.out.println("Enter second number: ");
//		double num2 = input.nextDouble();

		double result = 0.0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("***************************");
			System.out.println("**     Answer= " + result + "      **");
			System.out.println("***************************");
			break;
		case '-':
			result = num1 - num2;
			System.out.println("***************************");
			System.out.println("**     Answer= " + result + "      **");
			System.out.println("***************************");
			break;
		case '*':
			result = num1 * num2;
			System.out.println("***************************");
			System.out.println("**     Answer= " + result + "      **");
			System.out.println("***************************");
			break;
		case '/':
			result = num1 / num2;
			System.out.println("***************************");
			System.out.println("**     Answer= " + result + "      **");
			System.out.println("***************************");
			break;
		default:
			System.out.println("***************************");
			System.out.println("**   Invalid Operator    **");
			System.out.println("***************************");
		}

	}

}
