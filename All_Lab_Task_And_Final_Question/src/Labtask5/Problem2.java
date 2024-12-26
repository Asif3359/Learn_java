package Labtask5;

import java.util.Scanner;

public class Problem2 {
    public Problem2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println("Enter index Number : ");
        int a = sc.nextInt();

        try {
            int val = arr[a];
            System.out.println("At Index " + a + " Value is " + val);
        } catch (ArrayIndexOutOfBoundsException var5) {
            System.out.println("Error : Index out of bounds " + var5.getMessage());
        }

    }
}
