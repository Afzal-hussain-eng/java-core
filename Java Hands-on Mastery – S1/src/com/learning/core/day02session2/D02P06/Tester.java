package com.learning.core.day02session2.D02P06;

public class Tester {
	 public static void main(String[] args) throws NotEligibleException {
	        // Test case 1: Two critics
			CricketRating player1 = new CricketRating("John", 9.3f, 9.67f);
			player1.display();

			// Test case 2: Three critics
			CricketRating player2 = new CricketRating("Henry", 9.5f, 0);
			player2.display();
	    }
	}