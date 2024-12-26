package Labtask7.classes;

public class Box<T> {
    private T value;  // This can store any type of object (Integer, String, Double, etc.)

    // Method to set the value of the box
    public void setValue(T value) {
        this.value = value;
    }

    // Method to get the value from the box
    public T getValue() {
        return value;
    }
}
