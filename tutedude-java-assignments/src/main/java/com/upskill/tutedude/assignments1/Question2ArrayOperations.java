package com.upskill.tutedude.assignments1;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Write a Java program that creates an array of integers and performs the following operations: - Assign values to the array
 * - Find the sum and average of the array elements
 * - Find the largest and smallest element in the array
 * 
 * Clarifications:
 * 1. Create an array of integers.
 * 2. Assign values to the array using a loop or direct initialization.
 * 3. Calculate the sum and average of the array elements.
 * 4. Find and display the largest and smallest elements in the array.
 * 
 * Expected Output:
 * Array elements: 10, 20, 30, 40, 50
 * Sum of array elements: 150
 * Average of array elements: 30
 * Largest element: 50
 * Smallest element: 10
 * 
 */
public class Question2ArrayOperations {

	public static int[] inputArray;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the size of the Array : ");
	int arraySize=sc.nextInt();
	pushElementsIntoArray(arraySize);
	System.out.println("\nArray elements : "+Arrays.toString(inputArray));
	computeArrayElementsSumAndAvgs(arraySize);
	getMaxAndMinElementOfArray(arraySize);
	sc.close();
	}
	
	/**
	 * Compute the sum & average of the array elements.
	 * 
	 * @param size
	 * 
	 */
	public static void computeArrayElementsSumAndAvgs(int size) {
		double sum = 0, avg = 0;
		for (int i = 0; i < size; i++) {
			sum += inputArray[i];
		}
		avg = (sum / size);
		System.out.println("\nSum of array elements     : " + sum);
		System.out.println("\nAverage of array elements : " + avg);
	}
	

	/**
	 * Find the Maximum & Minimum value from array
	 * 
	 * @param size
	 * 
	 */
	public static void getMaxAndMinElementOfArray(int size) {
		int maxItem = inputArray[0];
		int minItem = inputArray[0];
		for (int i = 0; i < size; i++) {
			maxItem = (inputArray[i] < maxItem) ? maxItem : inputArray[i];
			minItem = (inputArray[i] > minItem) ? minItem : inputArray[i];
		}
		System.out.println("\nLargest element  : " + maxItem);
		System.out.println("\nSmallest element : " + minItem);
	}
	

	/**
	 * Take array elements inputs from User.
	 * 
	 * @param size
	 * 
	 */
	public static void pushElementsIntoArray(int size) {
		Scanner sc2 = new Scanner(System.in);
		inputArray = new int[size];
		System.out.println("\nEnter the array elements : ");
		for (int i = 0; i < size; i++) {
			inputArray[i] = sc2.nextInt();
		}
		sc2.close();
	}

}