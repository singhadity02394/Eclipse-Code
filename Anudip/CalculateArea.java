package Anudip;
import java.util.*;
//create the custom class1
class LengthValueException extends Exception{
    LengthValueException(String msg){
        super(msg);

    }
    }
    //create the custom class2

    class WeightValueException extends  Exception{

    WeightValueException(String msg){
        super(msg);
    }
    }
//create the classl

    class Rectangl
    {
    double length;
    double weight;
     public Rectangl( double length,double weight)throws LengthValueException,WeightValueException{
        if(length<=0){
            throw new LengthValueException("length value Invalid");
        }else if(weight<=0){
            throw new WeightValueException("weight value Invalid");

        }

        this.length=length;
        this.weight= weight;



    }
    //Area Method
        public double Area() {
            return length * weight;
        }
        //Perimeter Method

        public double Perimeter() {
            return 2 * (length + weight);
        }





    }



public class CalculateArea {
    //Main Method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Length in cm: ");
        double length = sc.nextDouble();
        System.out.println("Enter the value of weight in cm");
        double weight = sc.nextDouble();

        //Exception check
        try {
            Rectangl rectangle = new  Rectangl(length,weight);
            System.out.println("Area of rectangle: " + rectangle.Area()+" sq cm");
            System.out.println("Perimeter of rectangle: " + rectangle.Perimeter()+ " cm");
        } catch (LengthValueException e){
            System.out.println(e.getMessage());
        }
        catch (WeightValueException e){
            System.out.println(e.getMessage());

        }





    }
}
