package com.learning.core.day02session1.D02P05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SplitStringIntoFourDistinctStrings {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Take the input string
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();
        
        // Step 2: Check if the string can be split into four distinct strings
        String result = canSplitIntoFourDistinctStrings(input) ? "Yes" : "No";
        
        // Step 3: Output the result
        System.out.println("Output: " + result);
        
        scanner.close();
    }
    
    // Method to check if the string can be split into four distinct strings
    public static boolean canSplitIntoFourDistinctStrings(String input) {
        // Check if the length of the input string is divisible by 4
        if (input.length() % 4 != 0) {
            return false;
        }
        
        // Check if each substring formed by dividing the string into four equal parts is distinct
        int substringLength = input.length() / 4;
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < input.length(); i += substringLength) {
            String substring = input.substring(i, i + substringLength);
            if (!substrings.add(substring)) {
                return false; // Duplicate substring found
            }
        }
        
        return true;
    }
}