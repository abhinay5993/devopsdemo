package com.upskill.tutedude.assignments2;

/**
 * This is the Entity class for Question 3
 * 
 * Question 3: 
 * Write a Java program to demonstrate the concepts of classes,
 * objects, and constructors. Create a class 'Student' with attributes like
 * 'name', 'age', and 'grade'. Use a constructor to initialize these attributes,
 * and then create an object of the class in the main method to display the
 * student's information.
 * 
 * Clarifications: 
 * 1. Create a 'Student' class with attributes 'name', 'age', and 'grade'. 
 * 2. Define a constructor to initialize the attributes. 
 * 3. In the main method, create an object of the 'Student' class and display its information.
 * 
 * Expected Output: 
 * Student Information: 
 * Name: John Doe 
 * Age: 20 
 * Grade: A
 * 
 */
public class Student {

	String name;
	int age;
	char grade;

	public Student(String name, int age, char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public void displayInformation() {
		System.out.println("Student Information:");
		System.out.println("Name  : " + name);
		System.out.println("Age   : " + age);
		System.out.println("Grade : " + grade);
	}

}