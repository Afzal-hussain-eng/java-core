package com.learning.core.day02session1.D02P05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchPattern {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take input strings from the user
	        System.out.print("Enter the strings in the dictionary (separated by spaces): ");
	        String[] dictionary = scanner.nextLine().split("\\s+");

	        // Step 2: Take input pattern from the user
	        System.out.print("Enter the pattern: ");
	        String pattern = scanner.nextLine();

	        // Step 3: Find strings in the dictionary that match the pattern
	        List<String> matchingStrings = findMatchingStrings(pattern, dictionary);

	        // Step 4: Output the result
	        if (matchingStrings.isEmpty()) {
	            System.out.println("No strings in the dictionary match the pattern.");
	        } else {
	            System.out.println("Output:");
	            for (String str : matchingStrings) {
	                System.out.println(str);
	            }
	        }

	        scanner.close();
	    }

	    // Method to find strings in the dictionary that match the pattern
	    public static List<String> findMatchingStrings(String pattern, String[] dictionary) {
	        List<String> matchingStrings = new ArrayList<>();
	        System.out.println("Pattern: " + pattern);
	        for (String str : dictionary) {
	            System.out.println("String: " + str);
	            if (matchesPattern(pattern, str)) {
	                matchingStrings.add(str);
	            }
	        }
	        return matchingStrings;
	    }

	    // Method to check if a string matches the pattern
	    public static boolean matchesPattern(String pattern, String str) {
	        if (pattern.length() != str.length()) {
	            return false;
	        }
	        for (int i = 0; i < pattern.length(); i++) {
	            if (pattern.charAt(i) != '.' && pattern.charAt(i) != str.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}