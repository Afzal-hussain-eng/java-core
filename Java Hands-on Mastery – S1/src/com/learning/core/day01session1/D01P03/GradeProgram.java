package com.learning.core.day01session1.D01P03;

import java.util.Scanner;

public class GradeProgram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter percentage marks: ");
            double percentage = scanner.nextDouble();

            if (isValidInput(percentage)) {
                char grade = calculateGrade(percentage);
                System.out.println("Grade: " + grade);
                break; // Break out of the loop if input is valid
            } else {
                System.out.println("Invalid Input please enter valid markes");
                // Consume the invalid input
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static boolean isValidInput(double percentage) {
        return percentage >= 0 && percentage <= 100;
    }

    public static char calculateGrade(double percentage) {
        char grade;

        if (percentage >= 60) {
            grade = 'A';
        } else if (percentage >= 45) {
            grade = 'B';
        } else if (percentage >= 35) {
            grade = 'C';
        } else {
            grade = 'F'; // Fail
        }

        return grade;
    }
}