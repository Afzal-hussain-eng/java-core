package com.learning.core.day01session2.D01P04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationsProgram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array of numbers: ");
        String numbersString = scanner.next();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        List<String> combinations = findCombinations(numbersString, k);
        
        System.out.println("Distinct combinations of length " + k + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }

        scanner.close();
    }

    public static List<String> findCombinations(String numbersString, int k) {
        List<String> combinations = new ArrayList<>();
        generateCombinations(numbersString, k, 0, new StringBuilder(), combinations);
        return combinations;
    }

    private static void generateCombinations(String numbersString, int k, int start, StringBuilder current, List<String> combinations) {
        if (k == 0) {
            combinations.add(current.toString());
            return;
        }

        for (int i = start; i <= numbersString.length() - k; i++) {
            current.append(numbersString.charAt(i));
            generateCombinations(numbersString, k - 1, i + 1, current, combinations);
            current.deleteCharAt(current.length() - 1);
        }
    }
}