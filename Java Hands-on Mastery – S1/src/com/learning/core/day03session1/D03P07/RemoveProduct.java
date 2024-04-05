package com.learning.core.day03session1.D03P07;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveProduct {
	 public static void main(String[] args) {
	        // Create a HashSet to store product details
	        HashSet<Product> products = new HashSet<>();

	        // Predefined information of 4 products
	        products.add(new Product("P001", "Maruti 800"));
	        products.add(new Product("P002", "Maruti Zen"));
	        products.add(new Product("P003", "Maruti Dezire"));
	        products.add(new Product("P004", "Maruti Alto"));

	        // Get the product id to be removed from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the product id to remove: ");
	        String removeProductId = scanner.nextLine();
	        scanner.close();

	        // Remove the specified product from the HashSet
	        for (Product product : products) {
	            if (removeProductId.equals(product.getProductId())) {
	                products.remove(product);
	                break;
	            }
	        }

	        // List all the product details after removal
	        System.out.println("The Updated Product List is");
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }
	}