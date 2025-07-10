package com.upskill.tutedude.assignments1;
import java.util.Scanner;

/**
 * 
 * Question 3:
 * Write a Java program that uses If-Else and Nested If-Else statements to determine whether a person is eligible for voting. 
 * A person is eligible to vote if their age is greater than or equal to 18. Additionally, if the age is above 18, 
 * check whether the person has valid identification to vote. Use nested If-Else to handle these conditions.
 * 
 * Clarifications:
 * 1. Use an If-Else statement to check if the person's age is 18 or greater.
 * 2. If the person is eligible (age >= 18), use a nested If-Else to check if they have valid identification.
 * 3. Display appropriate messages based on the conditions (eligible, not eligible, or missing ID) and use of user input is necessary.
 * 
 * Expected Output:
 * Enter your age: 20
 * Do you have a valid ID? (yes/no): yes
 * You are eligible to vote.
 * 
 */
public class Question3VotingIdentifications {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age : ");
	int ageValue=sc.nextInt();
	System.out.println(checkVotingElegibilityStatus(ageValue));
	sc.close();
	}
	
	
	/**
	 * Validation for voting eligibility status
	 * @param age
	 * @return strVoteStatus
	 * 
	 */
	public static String checkVotingElegibilityStatus(int age) {
		Scanner sc2 = new Scanner(System.in);
		String strVoteStatus = "";
		if (age >= 18) {
			System.out.print("Do you have a valid ID? (yes/no) : ");
			String strValidId = sc2.nextLine();
			if (strValidId.equals("yes")) {
				strVoteStatus = "You are eligible to vote.";
			} else {
				strVoteStatus = "missing ID.";
			}
		} else {
			strVoteStatus = "You are not eligible to vote.";
		}
		sc2.close();
		return strVoteStatus;
	}

}