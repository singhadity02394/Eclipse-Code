package Anudip;
class Array{
    public void printArr(int[] arr){
        for(int i=0;i<=6;i++){
            System.out.println("Array value:"+ arr[i]);
        }





    }


}

public class ArrayLab {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8};
        try{
            Array a = new Array();
            a.printArr(arr);


        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
