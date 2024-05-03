package Anudip;


import java.util.*;
public class Account{
    //variable member
    long accountNu;
    String accholderName;
    String ifsccode;
    long mobilNum;
    //constructer
    public Account(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account data");
        System.out.println("Enter the Ac/Nu ");
        accountNu = sc.nextLong();
    
        System.out.println("Enter the accountholder Name");
        accholderName = sc.nextLine();
        sc.nextLine();
        
        System.out.println("Enter the ifsccode");
        ifsccode = sc.nextLine();
        
        System.out.println("Enter the mobileNum");
        mobilNum = sc.nextLong();
        
        System.out.println("------------------------------");
        
    }
    
    //method
    public void displaydata() {
        System.out.println("show all data of accountHolder");
        System.out.println("Ac/Num of a accountHolder--" + accountNu);
        System.out.println("AccountHolder Name --:" + accholderName);
        System.out.println("Ifsc code of bank --:" + ifsccode);
        
        
  }
    
    
    }


