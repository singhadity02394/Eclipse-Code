package Anudip;
import java.util.*;

public class SavingAccount extends Account {
	

	    //member variable
	    Scanner sc ;
	    float balance;
	    
	    public SavingAccount(){
	        sc = new Scanner(System.in);
	        System.out.println("Enter the balance:");
	        balance = sc.nextFloat();
	        System.out.println("---------------------------------");
	        
	        }
	        //balanceintlization
	        public void balanceintlization(){
	            System.out.println("total balance:"+ balance);
	            System.out.println("---------------------------------");
	            }
	    
	        // method;
	    public void depositecase(){
	        System.out.println("enetr the deposite amount");
	        int amount = sc.nextInt();
	        balance +=amount;
	    }
	    
	    //method of withdra
	    public void withdraw(){
	        System.out.println("Enter the witAmount");
	        float witAmount = sc.nextFloat();
	        
	        if(balance - witAmount >= 1000){
	            
	            System.out.println("witdral succefull-:" + witAmount);
	            System.out.println("-----------------");
	            balanceintlization();
	            }else{
	                System.out.println("balance is insufcent");
	                System.out.println("-------------");
	            }
	    }
}

	    
	    
	


