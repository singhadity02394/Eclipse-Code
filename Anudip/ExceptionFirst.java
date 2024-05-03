package Anudip;

public class ExceptionFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =100,b=0,c;
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		finally{
			System.out.println("hello java");
			
		}

	}

}
