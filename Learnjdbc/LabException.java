package Learnjdbc;
/*Write a Java program that reads data from a text file containing
integers. Implement exception handling to deal with the following scenarios:
Scenario 1: If the file is not found, catch the exception and print a user-friendly
error message. Scenario 2: If there is a non-integer value in the file, catch the
exception and skip that particular value, continuing with the next one.? use class object */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabException {
    public static void main(String[] args) {
        File file = new File("data.txt"); // Change the file path accordingly

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                try {
                    int num = scanner.nextInt();
                    System.out.println("Read integer: " + num);
                } catch (Exception e) {
                    System.err.println("Skipped a non-integer value");
                    scanner.next(); // Skip the non-integer value
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        }
    }
}
