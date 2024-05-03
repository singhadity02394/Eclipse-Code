package Pattern;


public class Hollorectangle {
	public static void PrintH(int r, int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1 || i==4 ||j==1 ||j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int row = 4;
		int col = 5;
		PrintH(4,5);
	}

}
