package com.learning.core.day02session1.D02P05;


//Write a program to print all subsequences of a string.
//Input: abc
//Output:
//a, b, c, ab, bc, ac, abc




import java.util.Scanner;

public class SubsequencesOfAString {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take a string as input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Step 2: Print all subsequences of the string
	        System.out.println("Subsequences of the string:");
	        printSubsequences(inputString, "", 0);

	        scanner.close();
	    }

	    // Method to print all subsequences of a string
	    public static void printSubsequences(String str, String current, int index) {
	        // Base case: If index reaches the end of the string, print the current subsequence
	        if (index == str.length()) {
	            System.out.print(current + ", ");
	            return;
	        }

	        // Case 1: Include the current character
	        printSubsequences(str, current + str.charAt(index), index + 1);

	        // Case 2: Exclude the current character
	        printSubsequences(str, current, index + 1);
	    }
	}