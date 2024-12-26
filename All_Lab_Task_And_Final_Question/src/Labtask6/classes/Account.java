package Labtask6.classes;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance for this withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}
