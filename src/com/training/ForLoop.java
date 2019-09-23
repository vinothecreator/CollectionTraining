package com.training;

public class ForLoop {

	public static void main(String[] args) {

	/*	for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}*/
		
		//add one number with next number
		
		//1+2+3+......+1000
		
/*		
	 int sum=0;
	 
	 
	 for(int i=1;i<=100;i++)
	 {
		sum= sum+i;
	 }
	System.out.println(sum);
	*/
	
	
	
	//fibonacci series
	 
	 //0 1 1 2 3 5 8 
	  
	  
	  int n1=0;
	  int n2=1;
	  int n3=0;
	  System.out.println(n1);
	  System.out.println(n2);
	  
	  for(int i=2;i<20;i++)
	  {
		  
		  n3=n1+n2;
		  System.out.println(n3);
		  n1=n2;
		  n2=n3;
		  
	  }
	  
	  
	   
	
	
	
}
}