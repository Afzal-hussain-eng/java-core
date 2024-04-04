package com.learning.core.day02session1.D02P05;

//Write a program that takes a String as input and display the length of the string. Also display the string into uppercase and check whether it is a palindrome or not. (Refer Java API Documentation) Input: madam teaching Output:
//It is a Palindrome
//It is not a Palindrome.
import java.util.Scanner;

public class ChekForPalindrome {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take a string as input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Step 2: Calculate the length of the string
	        int length = inputString.length();
	        System.out.println("Length of the string: " + length);

	        // Step 3: Convert the string to uppercase
	        String uppercaseString = inputString.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);

	        // Step 4: Check if the string is a palindrome
	        boolean isPalindrome = checkPalindrome(inputString);
	        if (isPalindrome) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome.");
	        }

	        scanner.close();
	    }

	    // Method to check if a string is a palindrome
	    public static boolean checkPalindrome(String str) {
	        int length = str.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (str.charAt(i) != str.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}