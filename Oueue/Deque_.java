package Oueue;

import java.util.Deque;
import java.util.LinkedList;






public class Deque_ {
	 static class Stack{
		static Deque<Integer> m = new LinkedList<>();
		public   void push(int data) {
			m.addLast(data);
			
		
			
			
		}
		public int pop() {
		  return m.removeLast();
		 
		}
		public  int  peek() {
			int top =  m.getLast();
			return top;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack  = new Stack();
		 stack.push(2);
		 stack.push(3);
		 stack.push(4);
		 System.out.println(stack.pop());
		 System.out.println(stack.peek());

	}

}
