package Anudip;
import java.util.*;
import java.lang.reflect.Method;
import java.math.*;
 class VCalculator {
    // Method to calculate the volume of a cube
    public double calculateVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }

    // Method to calculate the volume of a cuboid
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate the volume of a cylinder
    public double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate the volume of a cone
    public double calculateVolume(double radius, double height, String figureType) {
        if (figureType.equals("cone")) {
            return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        } else {
            // Handle other figure types or throw an exception
            throw new IllegalArgumentException("Unsupported figure type");
        }
    }

    // Method to calculate the volume of a sphere
    public double calculateVolume(double radius, String figureType) {
        if (figureType.equals("sphere")) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        } else {
            // Handle other figure types or throw an exception
            throw new IllegalArgumentException("Unsupported figure type");
        }
    }
 }
    
    public class Driven{

    public static void main(String[] args) {
        VCalculator calculator = new VCalculator();

        System.out.println("Volume of cube with side length 3: " + calculator.calculateVolume(3));
        System.out.println("Volume of cuboid with length 4, width 5, and height 6: " + calculator.calculateVolume(4, 5, 6));
        System.out.println("Volume of cylinder with radius 2 and height 8: " + calculator.calculateVolume(2, 8));
        System.out.println("Volume of cone with radius 3 and height 7: " + calculator.calculateVolume(3, 7, "cone"));
        System.out.println("Volume of sphere with radius 4: " + calculator.calculateVolume(4, "sphere"));
    }
    }
 

