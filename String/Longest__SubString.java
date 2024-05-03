package String;

import java.util.HashSet;

public class Longest__SubString {
	
	public static String isSubString(String s) {
		HashSet<Character> set = new HashSet<Character>();
		String Overall ="";
		String tillallString ="";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(set.contains(c)) {
				tillallString="";
				set.clear();
			}
			set.add(c);
			tillallString +=c;
			
			if(tillallString.length()>Overall.length()) {
				Overall =tillallString;
			}
		}
		return Overall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string  ="abcdeab";
		System.out.println(isSubString(string));

	}

}
