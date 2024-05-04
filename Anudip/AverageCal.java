package Anudip;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

class GradeCalculator {
    private int[] grades;

    public GradeCalculator(int numberOfGrades) {
        grades = new int[numberOfGrades];
    }

    public void inputGrades(Scanner scanner) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1) + ":");
            grades[i] = getValidInput(scanner);
        }
    }

    public double calculateAverage() {
        if (grades.length == 0) {
            return 0; // Avoid division by zero
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    private int getValidInput(Scanner scanner) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        return input;
    }
}

public class AverageCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of grades:");
        int numberOfGrades = scanner.nextInt();

        GradeCalculator gradeCalculator = new GradeCalculator(numberOfGrades);
        gradeCalculator.inputGrades(scanner);

        double average = gradeCalculator.calculateAverage();
        System.out.println("The average grade is: " + average);

        scanner.close();
    }
}
