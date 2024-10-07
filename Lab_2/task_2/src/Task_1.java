import java.util.Scanner;

public class Task_1 {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter A number to check Prime Or Not :");
        n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " Is Prime Number");
        } else {
            System.out.println(n + " Is Not  Prime Number");
        }

    }
}