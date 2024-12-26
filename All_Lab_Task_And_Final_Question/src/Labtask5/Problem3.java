package Labtask5;

import java.util.Scanner;

public class Problem3 {
    public Problem3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Number A , B for divide :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int div = a / b;
            System.out.println("Division A/B = " + div);
            System.out.println("Enter a string to convert Integer :");
            String str = sc.next();
            int parseInt = Integer.parseInt(str);
            System.out.println("String converted to Integer " + parseInt);
            int[] arr = new int[]{1, 2, 3, 4, 5};
            System.out.println("Enter A index Number for find value of array :");
            int index = sc.nextInt();
            int arrVal = arr[index];
            System.out.println("Your Array Value is : " + arrVal);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException var10) {
            System.out.println(var10.getMessage());
        }

    }
}
