package com.learning.core.day01session1.D01P03;

import java.util.Scanner;

public class RightAngleTriangleProgram {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        // Outer loop for rows
	        for (int i = 1; i <= rows; i++) {
	            // Inner loop for printing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }

	        scanner.close();
	    }
	}