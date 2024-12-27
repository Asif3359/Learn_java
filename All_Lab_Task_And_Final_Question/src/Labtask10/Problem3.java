package Labtask10;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Student :");
        int studentNo = sc.nextInt();

        HashMap<String, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < studentNo; i++) {
            System.out.print("Enter Name :");
            String name = sc.next();
            System.out.print("Enters Number Array size : ");
            int numArraySize = sc.nextInt();
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < numArraySize; j++) {
                System.out.println("Enter Number " + (j + 1) + " - :");
                int number = sc.nextInt();
                numbers.add(number);
            }
            mp.put(name, numbers);
        }
        // Output
        System.out.println("\nStudent Details:");
        for (Map.Entry<String, List<Integer>> entry : mp.entrySet()) {
            System.out.println("Name: " + entry.getKey());
            System.out.println("Numbers: " + entry.getValue());
        }
    }
}
