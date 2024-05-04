package Anudip;
import java.util.*;
class Calcul{
    public void printSolution(int num1,int num2,char ch){
        switch(ch){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case'*':
                System.out.println(num1 * num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
            System.out.println("Invalid input");

        }
    }
}


public class Calculateor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two number:");
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/):");
        char c = sc.next().charAt(0);

        Calcul cv = new  Calcul();
        cv.printSolution(num1,num2,c);







    }
}
