package com.learning.core.day02session1.D02P05;


//Given a string S, find the length of the longest prefix, which is also a suffix. The prefix and suffix should not overlap.
//Input :
//aabcdaabc
//Output: 4



import java.util.Scanner;

public class LongestPrefixSuffix {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Step 1: Take the input string
	        System.out.print("Enter the input string: ");
	        String str = scanner.nextLine();
	        
	        // Step 2: Find the length of the longest prefix suffix
	        int length = longestPrefixSuffixLength(str);
	        
	        // Step 3: Output the result
	        System.out.println("Output: " + length);
	        
	        scanner.close();
	    }
	    
	    // Method to find the length of the longest prefix that is also a suffix
	    public static int longestPrefixSuffixLength(String str) {
	        int n = str.length();
	        int maxPrefixSuffixLength = 0;
	        
	        // Use two pointers to represent the prefix-suffix window
	        int left = 0;
	        int right = n - 1;
	        
	        // Iterate through the string from left to right
	        while (left < right) {
	            // If substrings within the window match, update the max length
	            if (str.substring(0, left + 1).equals(str.substring(right))) {
	                maxPrefixSuffixLength = left + 1;
	            }
	            left++;
	            right--;
	        }
	        
	        return maxPrefixSuffixLength;
	    }
	}