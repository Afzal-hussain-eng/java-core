package com.learning.core.day03session2.D03P08;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	 private HashMap<String, String> phoneBook;

	    // Constructor to initialize the phone book
	    public PhoneBook() {
	        phoneBook = new HashMap<>();
	    }

	    // Method to add a phone book entry
	    public void addEntry(String name, String phoneNumber) {
	        phoneBook.put(name, phoneNumber);
	    }

	    // Method to list all phone book entries
	    public void listEntries() {
	        System.out.println("Phone Book Details:");
	        for (String name : phoneBook.keySet()) {
	            System.out.println(name + " " + phoneBook.get(name));
	        }
	    }

	    // Method to search for a phone number by name
	    public String searchPhoneNumber(String name) {
	        return phoneBook.get(name);
	    }

	    public static void main(String[] args) {
	        // Create a new Scanner object to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        // Create a new PhoneBook object
	        PhoneBook phoneBook = new PhoneBook();

	        // Add predefined information of 5 phone book details
	        phoneBook.addEntry("Amal", "998787823");
	        phoneBook.addEntry("Manvitha", "937843978");
	        phoneBook.addEntry("Joseph", "7882221113");
	        phoneBook.addEntry("Smith", "8293893311");
	        phoneBook.addEntry("Kathe", "7234560011");

	        // List all the phone book details
	        phoneBook.listEntries();

	        // Ask the user for a name to search
	        
	        System.out.println(" ");
	        System.out.print("Enter the name to search for: ");
	        String name = scanner.nextLine();

	        // Search for a phone number by the entered name
	        String phoneNumber = phoneBook.searchPhoneNumber(name);
	        if (phoneNumber != null) {
	            System.out.println("Phone number for " + name + ": " + phoneNumber);
	        } else {
	            System.out.println(name + " not found in the phone book.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}