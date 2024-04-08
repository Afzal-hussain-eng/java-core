package com.learning.core.day04session2.D04P10;

import java.util.Scanner;

public class LinearSearch {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the size of the array
	        System.out.println("Enter the size of array " );
	        int size = scanner.nextInt();

	        // Create an array of the given size
	        System.out.println("Enter the elements for array " );
	        int[] array = new int[size];

	        // Read the elements of the array
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Read the element to search
	        System.out.println("Enter the element to search in array ");
	        int searchElement = scanner.nextInt();

	        // Perform linear search
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (array[i] == searchElement) {
	                found = true;
	                break;
	            }
	        }

	        // Output the result
	        if (found) {
	            System.out.println("Element is Present");
	        } else {
	            System.out.println("Element is not Present");
	        }

	        scanner.close();
	    }
	}