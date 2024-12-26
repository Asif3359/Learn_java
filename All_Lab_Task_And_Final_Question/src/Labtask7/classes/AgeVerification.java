package Labtask7.classes;

public class AgeVerification {
    // Method to check if the user is eligible to vote
    public static void checkVotingEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You are not eligible to vote. You must be at least 18 years old.");
        }
        System.out.println("You are eligible to vote.");
    }
}
