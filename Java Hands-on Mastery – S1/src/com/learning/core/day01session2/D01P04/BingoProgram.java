package com.learning.core.day01session2.D01P04;

import java.util.Scanner;

public class BingoProgram {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept two numbers from the user
	        System.out.print("Enter two numbers between 1 and 40: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();

	        // Define the array of five integer elements
	        int[] array = {7, 25, 5, 19, 30};

	        // Check if both numbers are found in the array
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == num1) {
	                foundNum1 = true;
	            }
	            if (array[i] == num2) {
	                foundNum2 = true;
	            }
	        }

	        // Display the result
	        if (foundNum1 && foundNum2) {
	            System.out.println("Its Bingo");
	        } else {
	            System.out.println("Not Found");
	        }

	        scanner.close();
	    }
	}