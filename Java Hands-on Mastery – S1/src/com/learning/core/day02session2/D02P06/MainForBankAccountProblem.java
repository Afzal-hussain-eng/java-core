package com.learning.core.day02session2.D02P06;

import java.util.Scanner;

public class MainForBankAccountProblem{
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        System.out.print("Enter account type (Saving/Current): ");
        String accType = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        float balance = scanner.nextFloat();

        try {
            BankAccount account = new BankAccount(accNo, custName, accType, balance);
            System.out.println("Account created successfully!");
            System.out.println("Account details:");
            System.out.println("Account Number: " + account.getAccNo());
            System.out.println("Customer Name: " + account.getCustName());
            System.out.println("Account Type: " + account.getAccType());
            System.out.println("Balance: " + account.getBalance());
        } catch (LowBalanceException | NegativeAmount e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}