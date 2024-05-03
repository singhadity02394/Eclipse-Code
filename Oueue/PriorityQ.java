package Oueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stubP
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Comparator.reverseOrder());
		//Copartore.reverseOrder()
		pQ.add(2);
		pQ.add(1);
		pQ.add(6);
		pQ.add(5);
		
		while(!pQ.isEmpty()) {
			System.out.println(pQ.peek());
			pQ.remove();
		}

	}

}
