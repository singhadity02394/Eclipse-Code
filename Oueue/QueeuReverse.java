package Oueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueeuReverse {
	public static void printRev(Queue<Integer> q) {
		
		Stack<Integer> s1 = new Stack<>();
		while(!q.isEmpty()) {
			s1.push(q.remove());
		}
		while(!s1.isEmpty()) {
			q.add(s1.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		printRev(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}

	}

}
