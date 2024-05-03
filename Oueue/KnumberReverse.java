package Oueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class KnumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		int idx =3;
		
		Stack<Integer> sq = new Stack<>();
		while(q.size()>3) {
			sq.push(q.remove());
		}
		
		while(sq.size()>0) {
			q.add(sq.pop());
		}
		
		while(q.size()>0){
			System.out.print(q.remove());
			
		}
		

	}

}
