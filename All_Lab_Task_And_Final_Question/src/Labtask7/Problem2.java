package Labtask7;

import Labtask7.classes.AgeVerification;
import Labtask7.classes.UnderageException;

public class Problem2 {
    public static void main(String[] args) {

        try {
            AgeVerification.checkVotingEligibility(100);  // Try to check eligibility for a user aged 10
        } catch (UnderageException e) {
            System.out.println("Error: " + e.getMessage());  // Handle the exception and print the message
        }
    }
}
