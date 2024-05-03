package Pattern;



public class ZeroOnePatern {
	public static void printabl(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					System.out.print("1");
					
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int n =5;
		printabl(n);
	}

}
