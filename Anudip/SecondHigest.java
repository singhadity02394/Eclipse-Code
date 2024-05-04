package Anudip;

/* Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.

        Input: 2 4 5 3 6 7 9 4 5 6

Output:

Sub array: 5 3 6 7 9

        2nd Highest element: 7*/


public class SecondHigest {
    public static void main(String[] args){

        int[] arr = { 2, 4, 5, 3 ,6, 7 ,9 ,4, 5 ,6};
        int secondhigest =0;
        int fist =0;

        for(int i=2;i<7;i++){
            if(fist < arr[i]){
                fist = arr[i];

            }


        }

        System.out.println(secondhigest);








    }
}
