package com.learning.core.day02session2.D02P06;

public class BankAccount {
	private int accNo;
    private String custName;
    private String accType;
    private float balance;

    // Constructor
    public BankAccount(int accNo, String custName, String accType, float balance) throws Exception {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (balance < 0) {
            throw new NegativeAmount("NegativeAmount");
        }
        if (accType.equals("Saving") && balance < 1000) {
            throw new LowBalanceException("LowBalance");
        }
        if (accType.equals("Current") && balance < 5000) {
            throw new LowBalanceException("LowBalance");
        }
        
        
        this.balance = balance;
    }
    

    // Getter method for account number
    public int getAccNo() {
        return accNo;
    }

    // Getter method for customer name
    public String getCustName() {
        return custName;
    }

    // Getter method for account type
    public String getAccType() {
    	  return accType;
    }

    // Method to deposit amount
    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("NegativeAmount");
        }
        balance += amt;
    }

    // Method to get balance
    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equals("Saving")) {
            throw new LowBalanceException("LowBalance");
        }
        if (balance < 5000 && accType.equals("Current")) {
            throw new LowBalanceException("LowBalance");
        }
        return balance;
    }

}


   