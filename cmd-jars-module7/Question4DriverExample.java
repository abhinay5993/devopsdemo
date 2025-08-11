/**
 * 
 * Question 4: Write a Java program to demonstrate inheritance, interfaces, and
 * method overriding. Create a superclass 'Animal' with a method 'sound'. Then,
 * create a subclass 'Dog' that overrides the 'sound' method. Use an interface
 * 'Playable' that defines a 'play' method, and have 'Dog' implement the
 * 'Playable' interface.
 * 
 * Clarifications: 
 * 1. Create an 'Animal' class with a method 'sound'. 
 * 2. Create a 'Dog' class that inherits from 'Animal' and overrides the 'sound' method.
 * 3. Define an interface 'Playable' with a 'play' method, and implement it in the 'Dog' class. 
 * 4. Demonstrate the use of inheritance and method overriding in the main method.
 * 
 * Expected Output: 
 * Dog makes a sound: Woof 
 * Dog can play: Yes
 * 
 */
public class Question4DriverExample {
	
	public static void main(String[] args) {
	Dog dgObj=new Dog();
	dgObj.sound();
	dgObj.play();
	}

}