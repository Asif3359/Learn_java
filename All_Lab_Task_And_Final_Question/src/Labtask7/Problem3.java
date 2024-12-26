package Labtask7;

import Labtask7.classes.Box;

public class Problem3 {
    public static void main(String[] args) {
        // Create a Box for Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setValue(42);  // Set Integer value
        System.out.println("Integer Box contains: " + intBox.getValue());

        // Create a Box for String type
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello, Generics!");  // Set String value
        System.out.println("String Box contains: " + strBox.getValue());

        // Create a Box for Double type
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(3.14);  // Set Double value
        System.out.println("Double Box contains: " + doubleBox.getValue());


    }
}
