package Labtask8;

public class Problem1 {
    public static void main(String[] args) {
        // Array of strings
        String[] arr = {"cat", "apple", "ball"};

        // Bubble sort algorithm to sort the array of strings
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements using compareTo()
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap if the current string is greater than the next one
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted String Array: ");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
