package com.learning.core.day03session1.D03P07;

import java.util.HashSet;
import java.util.Scanner;

public class FindProduct {
	public static void main(String[] args) {
		// Create a HashSet to store product details
        HashSet<Product> products = new HashSet<>();

        // Predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));


        // Get search details from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product details to search (e.g., P003 Maruti Dezire): ");
        String searchProduct = scanner.nextLine();
 
        // Check if the specified product exists
        boolean found = false;
        for (Product product : products) {
            if (searchProduct.equals(product.getProductId() + " " + product.getProductName())) {
                found = true;
                break;
            }
        }

        // Display the search result
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
     
        // Close the scanner
        scanner.close();
	}
}