import java.util.Scanner;

class exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n % 2 == 0) System.out.println(n + " is even.");
        else System.out.println(n + " is odd.");

        long factorial = 1;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative integers.");
        } else if (n > 20) {
            System.out.println("Factorial demo supports values from 0 to 20.");
        } else {
            for (int i = 2; i <= n; i++) factorial *= i;
            System.out.println("Factorial = " + factorial);
        }

        System.out.print("Enter a number to check (0 exits): ");
        int value = sc.nextInt();
        while (value != 0) {
            if (value > 0) System.out.println("Positive");
            else System.out.println("Negative");
            System.out.print("Enter another number (0 exits): ");
            value = sc.nextInt();
        }
        sc.close();
    }
}
