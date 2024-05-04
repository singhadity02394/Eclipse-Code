package threadEx;

import java.util.*;

class NumberP implements Runnable {

    @Override
    public void run() {

        ReverseOddNumbers();
        SquareOfEvenNumbers();
        CubeOfNaturalNumbers();

    }

    public  void ReverseOddNumbers() {
        System.out.println("Reverse order of odd number");
       for(int i=10;i>=1;i--) {
           System.out.println("Odd number" + i + " _" + (2 * i - 1));
       }
       System.out.println("---------------------");
    }

    public void SquareOfEvenNumbers() {

        System.out.println( " - Displaying squares of even numbers:");
        for (int i=10;i>=2;i-=2) {
            System.out.println((i * i) + " ");

        }
        System.out.println("-------------------------------");
    }

    private void CubeOfNaturalNumbers() {
        System.out.println("Displaying cube of first 10 natural numbers:");


            for (int i=10;i>=1;i--) {
                int cube = i * i * i;
                System.out.println("Cube of " + i + " is: " + cube);
            }

    }
}

public class Examle3 {
    public static void main(String[] args) {
        // Create and start four threads


        Thread t1 = new Thread(new NumberP());

        t1.start();



    }
}

