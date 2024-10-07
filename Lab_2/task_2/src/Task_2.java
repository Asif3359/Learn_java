import java.util.Scanner;

public class Task_2 {

    static boolean isPalindrome(String x) {

        int i = 0, j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        sc.close();
    }
}
