package Anudip;
import java.util.*;
interface area{
	final static float pi =3.14F;
	float calculate(float x,float y);
}
//Rectangle method


class Rectangle implements area{
	public float calculate(float x, float y) {
		return x*y;
	}
	
}

//area calculate of circle
class Circlesex implements area{
	public float calculate(float x,float y) {
		return pi*x*x;
	}
}

public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle= new Rectangle();
		Circlesex crCircle = new Circlesex();
		area a;
		a=rectangle;
		System.out.println("Area  of Rectangle="+a.calculate(10, 20));
		
		a=crCircle;
		System.out.println("Area Circle ="+a.calculate(10, 0));

	}

}
