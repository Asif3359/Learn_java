package Labtask7;

import Labtask7.classes.BankAccount;
import Labtask7.classes.InsufficientFundsException;
import Labtask7.classes.NegativeAmountException;

public class Problem1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Creating account with an initial balance of 1000

        // Test cases to withdraw money
        try {
            account.withdraw(500);  // Valid withdrawal
            account.withdraw(600);  // Invalid: Insufficient funds
            account.withdraw(-200); // Invalid: Negative amount
        } catch (InsufficientFundsException | NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Check remaining balance
        System.out.println("Remaining balance: " + account.getBalance());
    }
}
