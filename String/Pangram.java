package String;

public class Pangram {
	public static boolean isPalindrom(String s) {
		if(s.length()<26) {
			return false;
		}
		else {
			for(int ch='a'; ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String strin  ="The a iskkkd jdgr Ram sjjj jfif";
		System.out.println(isPalindrom(strin.toLowerCase()));
	}

}
