package Anudip;
import java.util.*;
class CheckN{
    public void printNbit( int num,int n){
        // Check if the nth bit is set (1) or not (0)
        int mask = 1;
        for (int i = 0; i < n; i++) {
            mask = mask << 1;
        }

        int result = (num & mask) != 0 ? 1 : 0;

        // Display the result
        System.out.println("The " + n + "th bit of " + num + " is set to: " + result);


    }



}

 class Checknbit {

    public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter the number num: ");
            int num = scanner.nextInt();

            System.out.print("Enter the position of the bit to check: ");
            int n = scanner.nextInt();

        CheckN c = new CheckN();
        c.printNbit(  num, n);





        }
    }





