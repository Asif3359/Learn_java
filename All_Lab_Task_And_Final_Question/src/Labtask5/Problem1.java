package Labtask5;

import java.io.PrintStream;
import java.util.Scanner;

public class Problem1 {
    public Problem1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            double div = (double)a / (double)b;
            PrintStream var10000 = System.out;
            Object[] var10002 = new Object[]{div};
            var10000.println("Division a/b = " + String.format("%.2f", var10002));
        } catch (ArithmeticException var6) {
            System.out.println("Error : Division by zero is not allowed. - " + var6.getMessage());
        }

    }
}
