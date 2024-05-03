package Recursion;

public class StringRev {
	public static void printRec(String s ,int idx) {
		if(idx==0) {
			System.out.println(s.charAt(idx));
			return;
			
			}
		System.out.println(s.charAt(idx));
		printRec( s,idx-1);
	}
	public static void main(String[] args) {
		String string = "abcde";
		
		printRec(string, string.length()-1);
	}
	

}
