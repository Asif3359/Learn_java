package Labtask6;

import Labtask6.classes.Character;

public class Problem2 {
    public static void main(String[] args) {
        try {
            // Test user input (replace these values with actual input from the user if needed)
            Character character = new Character();

            Character character2 = character.createCharacter("Alice", "mage", 20);
            System.out.println("Character created successfully: ");
            System.out.println("Name: " + character2.getName());
            System.out.println("Class: " + character2.getClassType());
            System.out.println("Level: " + character2.getLevel());

        } catch (IllegalArgumentException e) {
            // Handle exception and display error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
