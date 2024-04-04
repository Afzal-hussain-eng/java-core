package com.learning.core.day01session1.D01P03;

import java.util.Scanner;

public class WeekdayProgram {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter a number between 1 and 7: ");
	            int dayNumber = scanner.nextInt();

	            if (dayNumber >= 1 && dayNumber <= 7) {
	                String weekday = getWeekday(dayNumber);
	                System.out.println("Weekday: " + weekday);
	                break; // Break out of the loop if input is valid
	            } else {
	                System.out.println("Invalid Input Please enter the valid week number ");
	            }
	        }

	        scanner.close();
	    }

	    public static String getWeekday(int dayNumber) {
	        String[] weekdays = {
	            "Sunday", "Monday", "Tuesday", "Wednesday",
	            "Thursday", "Friday", "Saturday"
	        };

	        return weekdays[dayNumber - 1];
	    }
	}