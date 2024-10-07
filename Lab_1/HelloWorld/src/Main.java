import java.util.Scanner;

public class Main {

    /*
    * Simplae calculator
    * */
    static void simpleCalculator()
    {
        System.out.print("Enter the first number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the operator :");
        String operator = sc.nextLine();

        System.out.print("Enter the second number :");
        int b = sc.nextInt();

        if(operator.equals("+"))
        {
            int ans = a + b;
            System.out.print("Ans :" +ans);
        } else if (operator.equals("-")) {
            int ans = a - b;
            System.out.print("Ans :" +ans);
        } else if (operator.equals("*")) {
            int ans = a * b;
            System.out.print("Ans :" +ans);
        } else if (operator.equals("/")) {
            float ans = (float) a / b;
            System.out.print("Ans :" +ans);
        }
        else {
            System.out.println(" Invalid input ");
        }

    }

    /*
    * calculate sum of N
    * */
    private static void calculateSumofN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the  number :");
        int N = sc.nextInt();
        sc.nextLine();

        int sum = 0 ;
        for (int i = 0 ; i<N ; i++)
        {
            sum = sum+i;
            System.out.printf(" "+String.valueOf(sum));
        }

        System.out.println("\nSum 0f N Number :"+sum);
    }

    /*
    * find min max in array
    * */
    private static void findMaxAndMinInArray() {
        Scanner sc = new Scanner(System.in);
        int[] myNum = {10, 20, 30, 40 , 50 , 60 , 70, 80 , 90 , 100};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < myNum.length ; i++)
        {
            if(myNum[i] < min)
            {
                min = myNum[i];
            }
            if (myNum[i] > max)
            {
                max = myNum[i];
            }
        }
        System.out.println("Max number is : "+max);
        System.out.println("Min number is : "+min);
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        simpleCalculator();

        calculateSumofN();

        findMaxAndMinInArray();

    }

}