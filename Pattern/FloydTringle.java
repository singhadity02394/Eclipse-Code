package Pattern;



public class FloydTringle {
	public static void PrintF(int n) {
		int c =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;i<=i;j++) {
				System.out.print(c);
				c++;
				
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		int n =5;
		PrintF(n);
	}

}
