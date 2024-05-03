package Anudip;
import java.util.*;
class Calulate{
	int num1;
	int num2;
	Calulate(){
		Scanner scanner  = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		
	}
	
	public void divideTwonumber() {
		System.out.println("divide two number"+ num1/num2);
		
	}
}

public class TwoNumber {
	public static void main(String[] args) {
		Calulate calulate = new Calulate();
		calulate.divideTwonumber();
		
	}

}
