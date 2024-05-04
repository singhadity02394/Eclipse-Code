package Anudip;
import java.util.*;
class Sum{
    public void printSum(ArrayList<Integer>aa){
        int sum =0;
        for(Integer i: aa){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.println("Sum of even number:" + sum);


    }




}

public class SumofEvenNumArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(12);
        aa.add(10);
        aa.add(11);
        aa.add(76);
        aa.add(7);

        Sum s = new Sum();
        s.printSum(aa);


    }
}
