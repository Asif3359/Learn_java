package Labtask6.classes;

public class Character {
    private String name;
    private String classType;
    private int level;

    public Character() {
    }

    // Constructor
    public Character(String name, String classType, int level) {
        this.name = name;
        this.classType = classType;
        this.level = level;
    }

    public Character createCharacter(String name, String classType, int level) {
        // Validate name
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        // Validate class type
        if (!(classType.equals("warrior") || classType.equals("mage"))) {
            throw new IllegalArgumentException("Class type must be 'warrior' or 'mage'.");
        }

        // Validate level
        if (level < 1 || level > 100) {
            throw new IllegalArgumentException("Level must be between 1 and 100.");
        }

        return new Character(name, classType, level);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public int getLevel() {
        return level;
    }
}
