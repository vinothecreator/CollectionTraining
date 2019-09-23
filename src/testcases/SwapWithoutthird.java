package testcases;

public class SwapWithoutthird {

	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		
		//using 3rd variable
	/*	
		int t;
		t= x;
		x=y;
		y=t;*/
		
		//  + operator
/*		x=x+y;
		y=x-y;
		x=x-y;*/
		
		//  * operator
/*		
		x= x*y;
		y= x/y;
		x=x/y;
		*/
		// AND operator
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("The Value of x:" +x);
		System.out.println("The Value of y:" +y);
		
		

	}

}
