package Labtask7.classes;

// Bank Account class
public  class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for the withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}