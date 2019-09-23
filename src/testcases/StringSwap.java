package testcases;

public class StringSwap {

	public static void main(String[] args) {
	
		String a ="Vinodh";
		String b= "kumar";
		
		System.out.println("Before Swap");
		System.out.println(a);
		System.out.println(b);
		
		
		//1.append
		
		a=a+b;
		
		//2.Store initial string a in sting b 
		b=a.substring(0, a.length()-b.length());
		
		//3.Store initail string b in string a 
		
		a=a.substring(b.length());
		
		
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
		
		

		
	}

}
