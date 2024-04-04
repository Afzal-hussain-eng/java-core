package com.learning.core.day02session1.D02P05;

//Write a program to find minimum number of deletion to make a string palindrome
//
//Input
//aebcbda
//
//output
//2


import java.util.Scanner;

public class MinimumDeletionsForPalindrome {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take a string as input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Step 2: Find the minimum number of deletions required
	        int minDeletions = findMinDeletionsForPalindrome(inputString);
	        System.out.println("Minimum number of deletions required: " + minDeletions);

	        scanner.close();
	    }

	    // Method to find the minimum number of deletions required to make a string palindrome
	    public static int findMinDeletionsForPalindrome(String str) {
	        int n = str.length();
	        
	        // Step 1: Find the longest palindromic subsequence (LPS) using dynamic programming
	        int[][] dp = new int[n][n];
	        for (int i = n - 1; i >= 0; i--) {
	            dp[i][i] = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = 2 + dp[i + 1][j - 1];
	                } else {
	                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        
	        // Step 2: Calculate the minimum number of deletions required
	        return n - dp[0][n - 1];
	    }
	}