package Pattern;

public class InvertedHalfPayrdigm {
	public static void print(int n) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n =5;
		print(5);
	}

}
