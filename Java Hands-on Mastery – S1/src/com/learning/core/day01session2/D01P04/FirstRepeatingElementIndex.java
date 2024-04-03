package com.learning.core.day01session2.D01P04;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingElementIndex {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int firstRepeatingIndex = findFirstRepeatingIndex(arr);
        System.out.println("Index of the first repeating element: " + firstRepeatingIndex);

        scanner.close();
    }

    public static int findFirstRepeatingIndex(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int firstRepeatingIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                firstRepeatingIndex = map.get(arr[i]);
                break;
            } else {
                map.put(arr[i], i);
            }
        }

        return firstRepeatingIndex;
    }
}