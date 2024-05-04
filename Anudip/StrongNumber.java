package Anudip;
import java.util.Scanner;
import java.util.Scanner;

class StrongNumberChecker {
    // Function to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Function to check if a number is a Strong number
    static boolean isStrongNumber(int num) {
        int sumOfFactorials = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == num;
    }
}

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        StrongNumberChecker checker = new StrongNumberChecker();

        if (checker.isStrongNumber(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }
}
