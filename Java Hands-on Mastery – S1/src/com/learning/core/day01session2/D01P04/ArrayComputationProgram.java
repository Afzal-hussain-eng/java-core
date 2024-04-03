package com.learning.core.day01session2.D01P04;

import java.util.Scanner;

public class ArrayComputationProgram {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept 18 elements from the user
	        System.out.print("Enter 18 elements separated by spaces: ");
	        int[] array = new int[18];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Compute the sum of elements from index 0 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += array[i];
	        }
	        array[15] = sum;

	        // Compute the average of all numbers and store it at element 16
	        double average = (double) sum / 18;
	        array[16] = (int) average;

	        // Identify the smallest value from the array and store it at element 17
	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        array[17] = min;

	        // Print the modified array   3 2 4 5 6 4 5 7 3 2 3 4 7 1 2 0 0 0
	        System.out.println("Modified Array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}