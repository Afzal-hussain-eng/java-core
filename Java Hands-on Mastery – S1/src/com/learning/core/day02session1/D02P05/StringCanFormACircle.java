package com.learning.core.day02session1.D02P05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringCanFormACircle {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take input for the number of strings
	        System.out.print("Enter the number of strings: ");
	        int numStrings = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        
	        // Step 2: Take input strings from the user
	        System.out.println("Enter the strings (press Enter after each string):");
	        List<String> strings = new ArrayList<>();
	        for (int i = 0; i < numStrings; i++) {
	            strings.add(scanner.nextLine());
	        }

	        // Step 3: Check if the strings can form a circle
	        boolean canFormCircle = canFormCircle(strings);

	        // Step 4: Output the result
	        if (canFormCircle) {
	            System.out.println("Yes, the strings can be chained to form a circle.");
	        } else {
	            System.out.println("No, the strings cannot be chained to form a circle.");
	        }

	        scanner.close();
	    }

	    // Method to check if the strings can form a circle
	    public static boolean canFormCircle(List<String> strings) {
	        // Generate all permutations of the strings
	        List<List<String>> permutations = generatePermutations(strings);

	        // Check if any permutation forms a circle
	        for (List<String> permutation : permutations) {
	            if (formsCircle(permutation)) {
	                return true; // Found a permutation that forms a circle
	            }
	        }
	        return false; // No permutation forms a circle
	    }

	    // Method to generate all permutations of the strings
	    public static List<List<String>> generatePermutations(List<String> strings) {
	        List<List<String>> permutations = new ArrayList<>();
	        backtrack(strings, new ArrayList<>(), new boolean[strings.size()], permutations);
	        return permutations;
	    }

	    // Backtracking method to generate permutations
	    private static void backtrack(List<String> strings, List<String> current, boolean[] visited, List<List<String>> permutations) {
	        if (current.size() == strings.size()) {
	            permutations.add(new ArrayList<>(current));
	            return;
	        }
	        for (int i = 0; i < strings.size(); i++) {
	            if (!visited[i]) {
	                current.add(strings.get(i));
	                visited[i] = true;
	                backtrack(strings, current, visited, permutations);
	                visited[i] = false;
	                current.remove(current.size() - 1);
	            }
	        }
	    }

	    // Method to check if a permutation forms a circle
	    private static boolean formsCircle(List<String> permutation) {
	        // Check if the last character of the previous string matches the first character of the next string
	        for (int i = 1; i < permutation.size(); i++) {
	            String prev = permutation.get(i - 1);
	            String curr = permutation.get(i);
	            if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
	                return false; // Invalid order, does not form a circle
	            }
	        }
	        // Check if the last character of the last string matches the first character of the first string
	        String first = permutation.get(0);
	        String last = permutation.get(permutation.size() - 1);
	        return first.charAt(0) == last.charAt(last.length() - 1);
	    }
	}