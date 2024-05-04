package Anudip;
import java.util.*;
class PalindromCheck{
    boolean palindrom(String st){
        int i =0;
        int j=st.length()-1;




        while(i<j){
            if(st.charAt(i)!= st.charAt(j)){
                return false;

            }
            i++;
            j--;


        }

        return true;



    }




}

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any String :");
        String str = sc.nextLine();

        PalindromCheck c = new PalindromCheck();


        if(c. palindrom(str)==false){
            System.out.println("not palindrom");
        }else{
            System.out.println("palindrom");
        }
    }
}
