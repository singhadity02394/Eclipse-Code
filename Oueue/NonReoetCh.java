package Oueue;
import java.util.*;

public class NonReoetCh {
	public static  void printString(String string) {
		int freq[] = new int[26];
		Queue<Character> q =new LinkedList<>(); 
		
		for(int i=0;i<string.length();i++) {
			char ch = string.charAt(i);
			q.add(ch);
			//freuency count;
			
			freq[ch-'a']++;
			
			while(!q.isEmpty() && freq[q.peek()-'a']>1) {
				q.remove();
			}
			if(q.isEmpty()) {
				System.out.print(-1+" ");
			}else {
				System.out.print(q.peek());
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aabccxb";
		printString(string);
		

	}

}
