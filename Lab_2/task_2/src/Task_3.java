import java.util.Scanner;

public class Task_3 {

    static void PrintTriangle(int a) {
        int K = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= K; j++) {
                System.out.print("*");
            }
            K++;
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        PrintTriangle(a);
    }
}
