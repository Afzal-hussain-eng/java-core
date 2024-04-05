package com.learning.core.day03session1.D03P07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindStudentName {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Create an ArrayList to store student names
     ArrayList<String> studentNames = new ArrayList<>();

       // Add student names to the ArrayList
      System.out.println("Enter student names separated by space:");
        String[] namesInput = scanner.nextLine().split(" ");
        for (String name : namesInput) {
            studentNames.add(name);
        }
        
        
//        ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("Jack", "Paul", "Henry", "Mary", "Ronaldo"));

        // Ask for the name to search
        System.out.println("Enter the name to search:");
        String searchName = scanner.nextLine();

        // Check if the name exists in the ArrayList
        boolean found = false;
        for (String name : studentNames) {
            if (name.equals(searchName)) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        scanner.close();
    }
}