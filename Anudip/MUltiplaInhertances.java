package Anudip;
import java.util.*;


//class first
class student{
	int roll;
	void getroll(int n) {
		roll=n;
	}
	
	void putroll() {
		System.out.println("Roll="+roll);
	}
}

//class second;

class test extends student{
	float mark1,mark2;
	void getmarks(float m1,float m2){
		mark1= m1;
		mark2 = m2;
		
	}
	
	void putmarks() {
		System.out.println("Mark1="+mark1+ "\nMarks2="+mark2);
	}
	
}
//interface 
interface sport{
	float sportmark=6.0F;
	void putsport();
}

class result extends test implements sport{
	float total;
	public void putsport() {
		System.out.println("Sport Mark=" + sportmark);
		
		
}

	
	void display() {
		total=mark1+mark2+sportmark;
		putroll();
		putmarks();
		putsport();
		System.out.println("Total Mark="+ total);
	}
	
}

public class MUltiplaInhertances {
	public static void main(String[] args) {
		result aa = new result();
		aa.getroll(101);
		aa.getmarks(30.5F, 35.9F);
		aa.display();
	}

}
