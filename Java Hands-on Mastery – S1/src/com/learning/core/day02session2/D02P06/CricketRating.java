package com.learning.core.day02session2.D02P06;

//CricketRating class
public class CricketRating {
	 private String playerName;
	    private float critic1;
	    private float critic2;
	    private float critic3;
	    private float avgRating;
	    private String coins;

	    // Constructor for two critics
	    public CricketRating(String playerName, float critic1, float critic2) throws NotEligibleException {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        calculateAverageRating(critic1, critic2);
	        calculateCoins();
	    }

	    // Constructor for three critics
	    public CricketRating(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        this.critic3 = critic3;
	        calculateAverageRating(critic1, critic2, critic3);
	        calculateCoins();
	    }

	    // Method to calculate average rating based on two critics
	    public void calculateAverageRating(float critic1, float critic2) {
	        avgRating = (critic1 + critic2) / 2;
	    }

	    // Method to calculate average rating based on three critics
	    public void calculateAverageRating(float critic1, float critic2, float critic3) {
	        avgRating = (critic1 + critic2 + critic3) / 3;
	    }

	    // Method to calculate coins based on average rating
	    public void calculateCoins() throws NotEligibleException  {
	        if (avgRating >= 7) {
	            coins = "Gold";
	        } else if (avgRating >= 5) {
	            coins = "Silver";
	        } else if (avgRating >= 2) {
	            coins = "Copper";
	        } else {
	        	throw new NotEligibleException ("The Player is NotEligible for coin");
	        }
	    }

	    // Method to display all information
	    public void display() {
	        System.out.println(playerName + " " + avgRating + " " + coins);
	    }
	}