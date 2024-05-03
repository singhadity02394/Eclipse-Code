package Anudip;
import java.util.*;
class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
	
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter your age");
     
     int age = scanner.nextInt();
    try {
     if(age<18) {
    	 throw new YoungerAgeException("you are not eligible for voting");
     }
     else {
    	 System.out.println("you are Eligble");
     }
    }catch(YoungerAgeException e){
    	e.printStackTrace();
    	
    }
    System.out.println("hello ");
	}
	

}
