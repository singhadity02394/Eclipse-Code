package Oueue;

import java.util.LinkedList;
import java.util.Queue;
public class DecimalTOBinary {
	public static void generateBinary(int n) {
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		while(n-->0) {
			String s1 = q.peek();
			q.remove();
			System.out.println(s1);
			String s2 = s1;
			q.add(s1+"0");
			q.add(s2+"1");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =20;
		generateBinary(n);
		

	}

}
