package testcases;

public class ReverseInt {

	public static void main(String[] args) {
		
		
		//Method one
		int num= 123456789;
		
		int rev=0;
		
		while(num!=0){
			rev= rev*10 + num%10;
			num=num/10;
		}

		System.out.println(rev);
		
		//Method two 
		
		int   num1= 12345;
		int num2= 98841;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
	
		

	}

}
