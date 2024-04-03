package com.learning.core.day01session1.D01P03;

import java.util.Scanner;

public class MonthNameProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 while (true) {
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();
       
        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = getMonthName(monthNumber);
            System.out.println("Month: " + monthName);
            break; // Break out of the loop if input is valid
        } 
        
        else {
            System.out.println("Invalid Input");
        }
        }

        scanner.close();
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        return monthNames[monthNumber - 1];
    }
}