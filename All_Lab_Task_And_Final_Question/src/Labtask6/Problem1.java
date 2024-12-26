package Labtask6;

import Labtask6.classes.Account;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        // Create an Account instance
        Account account = new Account("1", 100.00);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");

        try {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
