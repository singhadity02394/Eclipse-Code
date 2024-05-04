package Anudip;
import java.util.Scanner;
class Maximum{

    // Create a Scanner object ;


    public void printMaxium(int num1,int num2)

    {
        // Use the conditional/ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);
    }




}

public class FindMaximum {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //  user for input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            //object
            Maximum m = new Maximum();
            m.printMaxium(num1,num2);

        }
    }


