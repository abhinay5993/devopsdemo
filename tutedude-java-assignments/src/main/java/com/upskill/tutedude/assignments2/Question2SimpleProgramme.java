package com.upskill.tutedude.assignments2;

/**
 * Question 2: Explain the concept of 'public static void main' in Java. Write a
 * program that demonstrates the execution of a simple 'public static void main'
 * method, and explain its components: 'public', 'static', 'void', and 'main'.
 * 
 * Clarifications: 
 * 1. Define the 'public static void main' method in your program. 
 * 2. Explain the purpose of 'public', 'static', 'void', and 'main' in the method declaration. 
 * 3. Implement a simple program that outputs 'Hello, World!' using the main method.
 * 
 */
public class Question2SimpleProgramme {

	/**
	 * 1. public - It is an Access modifier, which specifies from where and who can access the method. Making the main() method public 
	 *             makes it globally available. It is made public so that JVM can invoke it from outside the class as it is not 
	 *             present in the current class.
	 * 2. static - It is a keyword that is when associated with a method, making it a class-related method. The main() method is 
	 *             static so that JVM can invoke it without instantiating the class. This also saves the unnecessary wastage of memory 
	 *             which would have been used by the object declared only for calling the main() method by the JVM.
	 * 3. void   - It is a keyword and is used to specify that a method does not return anything. As the main() method does not return 
	 *             anything, its return type is void.
	 * 4. main   - It is the name of the Java main method. It is the identifier that the JVM looks for as the starting point of 
	 *             the Java program. It's not a keyword.
	 * 
	 */
	public static void main(String[] args) {
	System.out.println("Hello, World!");
	}

}