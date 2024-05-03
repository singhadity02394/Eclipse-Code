package Anudip;
import java.util.*;

//abstract class declear
abstract class vehical{
	int nooftyeres;
	abstract void Start();
	
}

//class of car
class Car extends vehical{
	void Start() {
		System.out.println("car is start of key");
	}
}

//class of bike
class Bike extends vehical{
	void Start() {
		System.out.println("bike is start of kick");
	}
}

public class Abstraction {
public static void main(String[] args) {
	//vehical rfrence creater
vehical vehical  = new Car();
vehical.Start();
//bike object create
Bike bike = new Bike();
bike.Start();

}
}
