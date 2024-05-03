package Anudip;
import java.util.*;
class Circle{
	//method to calculate area
	public void Area(float radius) {
		System.out.println("area of circle:"+ Math.PI * Math.pow(radius, 2));
		System.out.println("-------------");
	}
	//method of Parameter
	
	public void Parameter(int radius) {
		System.out.println(" parameter of circle:"+2*Math.PI * Math.pow(radius, 2));
	}


}

public class CalculateAPC {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.Area(4.0F);
		circle.Parameter(5);
		
	}

}
