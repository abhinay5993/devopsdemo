package com.upskill.tutedude.assignments2;
import java.util.Scanner;

/**
 * Question 1: Write a Java program to demonstrate the usage of return types and
 * arguments. Create a method that takes two integers as arguments and returns
 * their sum. Then, call this method from the main method and display the
 * result.
 * 
 * Clarifications: 
 * 1. Define a method that takes two integer arguments and returns their sum. 
 * 2. In the main method, call the method with appropriate arguments and display the returned result. 
 * 3. Ensure the correct return type and arguments are used for the method.
 * 
 * Expected Output: Sum of 5 and 10: 15
 * 
 */
public class Question1ReturnTypesAndArguments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the first number : ");
		int a = sc.nextInt();
		System.out.println("\nEnter the second number : ");
		int b = sc.nextInt();
		int sum = getSumOfTwoNumbers(a, b);
		System.out.println("\nSum of " + a + " and " + b + " : " + sum + "");
		sc.close();
	}

	public static int getSumOfTwoNumbers(int x, int y) {
		return (x + y);
	}

}