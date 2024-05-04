package Anudip;
class MergeArray{
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] mergedArray = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        // Merge elements until one of the arrays is exhausted
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from the first array
        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements from the second array
        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }




}
public class Arraymerge {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        MergeArray mm = new MergeArray();

       int[] arrr = mm. mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Sorted Array:");
        for (int num : arrr) {
            System.out.print(num + " ");
        }
    }


}
