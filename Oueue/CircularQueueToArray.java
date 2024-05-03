package Oueue;

import java.util.*;

public class CircularQueueToArray {
	static class CircularQ{
		int front =-1;
		int rear = -1;
		int size = 0;
		int[] arr = new int[10];
		
		public  void add(int val )throws Exception{
			if(size == arr.length) {
				throw  new Exception("Queuue is full");
				
			}else if(size==0) {
				rear  = front =0;
				arr[0] = val;
			}else if(rear<arr.length-1){
				arr[++rear]= val; 
			}
			else if(rear==arr.length-1) {
				rear =0;
				arr[0] = val;
			}
			
			size++;
			
		}
		
		public int remove()throws Exception {
			if(size== 0) {
				throw new Exception("Empty");
				
			}
			else {
				int val = arr[front];
				if(front == arr.length-1) {
					
					front =0;
					
					
				}else {
					front++;
				}
				size--;
				
			
			return val;
			
		}
		  
		}
		 public int peek() throws Exception{
				if(size==0) {
					throw new Exception("empty");
				}
				else return arr[front];
				
			}
		 
		 public boolean isEmpty() {
			 if(size==0) {
				 return true;
			 }else return false;
		 }
		 
		 
		 public void display() {
			 if(size==0) {
				 System.out.println("Queue is empty");
			 }else if(front<=rear) {
				 for(int i=front;i<rear;i++) {
					 System.out.println(arr[i]+" ");
				 }
			 
			 }
			 else {//rear<front
				 for(int i= front;i<arr.length;i++) {
					 System.out.println(arr[i]+" ");
				 }
				 for(int i=0;i<=rear;i++) {
					 System.out.println(arr[i]+" ");
				 }
				 
			 }
		 }
	}

	public static void main(String[] args ) throws Exception{
		// TODO Auto-generated method stub
		CircularQ q = new CircularQ();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		q.remove();
		q.display();
		q.add(0);
		
		System.out.println(q.peek());
		q.display();
		

	}

}
