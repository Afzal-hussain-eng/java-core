package com.learning.core.day02session1.D02P05;
////Write a program that takes String as input and count the last 'n' vowels of a given String. If the number is greater than the vowels found, then print 'Mismatch in Vowel Count                                   
//Input:
//Testing
//2
//Output:
//ei
import java.util.Scanner;

public class LastNVowelsCount {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take a string as input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Step 2: Take the value of 'n' as input
	        System.out.print("Enter the value of 'n': ");
	        int n = scanner.nextInt();

	        // Step 3: Count the last 'n' vowels of the string
	        String lastNVowels = countLastNVowels(inputString, n);
	        if (lastNVowels.equals("Mismatch in Vowel Count")) {
	            System.out.println(lastNVowels);
	        } else {
	            System.out.println("Last " + n + " vowels: " + lastNVowels);
	        }

	        scanner.close();
	    }

	    // Method to count the last 'n' vowels of a string
	    public static String countLastNVowels(String str, int n) {
	        String vowels = "aeiouAEIOU";
	        int count = 0;
	        StringBuilder lastNVowels = new StringBuilder();

	        for (int i = str.length() - 1; i >= 0; i--) {
	            char ch = str.charAt(i);
	            if (vowels.contains(String.valueOf(ch))) {
	                lastNVowels.insert(0, ch);
	                count++;
	            }
	            if (count == n) {
	                break;
	            }
	        }

	        if (count < n) {
	            return "Mismatch in Vowel Count";
	        }

	        return lastNVowels.toString();
	    }
	}