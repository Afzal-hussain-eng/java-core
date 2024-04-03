package com.learning.core.day01session1.D01P03;

import java.util.Scanner;

public class FactorialProgram {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);

	        scanner.close();
	    }

	    public static long calculateFactorial(int number) {
	        if (number < 0) {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
	        }
	        
	        long factorial = 1;
	        for (int i = 2; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	}
