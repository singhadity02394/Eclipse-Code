package Recursion;

public class TowerofHanoi {
	public static void printTower(int n, String src, String helper, String dest) {
		if(n==1) {
			System.out.println(" TransferDisk:"+ n+"from" + src+"to"+ dest);
			return;
		}
	      printTower(n-1,src, dest,helper);
	      System.out.println(" TransferDisk:"+ n+"from" + src+"to"+ dest);
	      
	      printTower(n-1,helper,src, dest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		printTower(n, "S", "H", "D");

	}

}
