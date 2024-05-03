package String;
class Arrays{
	public void printArr(int[] arr) {
		int n = arr.length;
		int[] newarr = new int[n];
		int j=0;
		for(int i=n-1;i>=0;i-=2) {
			newarr[j++] = arr[i];
			
		}
		//newarr[j++] = arr[n-1];
		
		
		for(int i=1;i<n-1;i+=2) {
			newarr[j++] = arr[i];
			
		}
		for(int i:newarr) {
			System.out.print(i);
		}
	}
}

public class ArrayRearange {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Arrays a = new Arrays();
		a.printArr(arr);
		
		
	}

}
