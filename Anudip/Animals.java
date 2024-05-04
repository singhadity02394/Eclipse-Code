package Anudip;
//2.Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat.
// ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound."
// ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively.
// ● The program should allow the user to create and display objects of each class.
import java.util.*;
//Superclass
class Animal{
    void makeSound(){

        System.out.println("The animal makes a sound.");
    }


}
//subclass 1
class Dog extends Animal{
    void makeSound() {
        System.out.println("The Cat barks");
    }


}
//superclass2

class Cat extends Animal{
    void makeSound() {


        System.out.println("The Cat meows");
    }


}
public class Animals {
    public static void main(String[] args){
        //create object
        Animal an = new Animal();
        Cat ct = new Cat();
        Dog dg = new Dog();

        an.makeSound();
        ct.makeSound();
        dg.makeSound();


    }
}
