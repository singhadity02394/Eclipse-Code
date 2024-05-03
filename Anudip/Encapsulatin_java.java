package Anudip;
import java.util.*;
class Empolye{
	private int empid;
	
	//setter
	public void setid(int em_id) {
		empid=em_id;
	}
	//getter
	public int getid() {
		return empid;
	}
}

public class Encapsulatin_java {
	public static void main(String[] args) {
		Empolye empolye= new Empolye();
		empolye.setid(122);
		System.out.println(empolye.getid());
		
		
	}

}
