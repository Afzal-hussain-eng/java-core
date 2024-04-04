package com.learning.core.day02session1.D02P05;

import java.util.Scanner;

public class ReplaceSpaces {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Step 1: Take the input string
	        System.out.print("Enter the input string: ");
	        String input = scanner.nextLine();
	        
	        // Step 2: Replace spaces with "%20"
	        String output = replaceSpaces(input);
	        
	        // Step 3: Output the result
	        System.out.println("Output: " + output);
	        
	        scanner.close();
	    }
	    
	    // Method to replace spaces with "%20"
	    public static String replaceSpaces(String input) {
	        StringBuilder sb = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            if (c == ' ') {
	                sb.append("%20");
	            } else {
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }
	}