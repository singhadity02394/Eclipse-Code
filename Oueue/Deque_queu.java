package Oueue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_queu {
	public static class Queue{
		static Deque<Integer> m = new LinkedList<>();
		public void add(int data) {
			m.addLast(data);
		}
		public int remove() {
			return  m.removeFirst();
		}
		public int peek() {
			return m.getFirst();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
			
		
		System.out.println(queue.remove());
		System.out.println(queue.peek());

	}

}
