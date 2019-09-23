package testcases;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "madam"; //Immutable object
		
		//String temp =s;


		int len = s.length();
		String rev= "";
		for(int i =len-1;i>=0;i--){
		rev =rev+s.charAt(i);
		}
	System.out.println(rev); //out of the for loop we should use
	if(s.equals(rev)){
		System.out.println("palindrome");
	}
	else 
	{
		System.out.println("not palindrome");
	}
	

	System.out.println(new StringBuffer(String.valueOf(s)).reverse());
	
	StringBuffer ss= new StringBuffer(s); // Mutable objects
	ss.reverse();
	System.out.println(ss);
	
	
}}


