package com.upskill.tutedude.assignments1;

/**
 * Question 1:
 * Write a Java program that demonstrates the use of variables and data types. 
 * The program should use variables of different data types (int, double, char, boolean, String) and perform basic operations such 
 * as addition, subtraction, multiplication, and string concatenation.
 * 
 * Clarifications:
 * 1. Declare variables of different data types (e.g., int, double, char, boolean, String).
 * 2. Perform basic arithmetic operations using numeric data types (int and double).
 * 3. Concatenate strings using the String variable and display the result.
 * 4. Display the results of all operations.
 * 
 * Expected Output:
 * Integer result of addition: 20
 * Double result of division: 15.5
 * Character: A
 * String concatenation result: Hello, world!
 * 
 */
public class Question1VariablesDataTypes {

	public static void main(String[] args) {
	//Numeric diclarations :
	int x=15;
	int y=5;
	int z=2;
	double frac1=31.0;
	double frac2=94.34;
	
	//char & boolean diclarations
	char ch1='A';
	char ch2='b';
	boolean flag=true;
	
	//String diclarations
	String strVar1="Hello, ";
	String strVar2="world!";
	
	//Operations
	int res1=(x+y);
	System.out.println("\nInteger result of addition : "+res1);
	double res2=(frac1/z);
	System.out.println("\nDouble result of division  : "+res2);
	System.out.println("\nCharacter : "+ch1);
	String strCont2=(strVar1+strVar2);
	System.out.println("\nString concatenation result : "+strCont2);
	
	double multRes=(frac2*x);
	System.out.println("\nResult of Multiplication : "+multRes);
	double subRes=(y-frac1);
	System.out.println("\nResult of Substraction : "+subRes);
	
	int newConChar=(ch1+ch2);
	System.out.println("\nConcatinated value of Chars : "+((char) newConChar));
	System.out.println("\nNegated status of boolean Flag : "+(!flag));
	}

}