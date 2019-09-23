package com.training.collection;

public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 25;
		arr[1] = 45;
		arr[2] = 65;
		arr[3] = 85;
		arr[4] = 105;
		
		// TO print the sum of all the elements in the array
		for(int z:arr)
		{
			System.out.println(z);
		}
		
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
		
		sum=sum+arr[i];
		}
		System.out.println(sum);
		
		// To find the largest value of the elements in the array
		
	/*	int max= arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}
			
				
		}
		System.out.println("Max value of the array " +max);*/
		
		
		
		// TO find the smallest value of the elements in the array 
		
		
	int min= arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min= arr[i];
			}
			
				
		}
		System.out.println("Min value of the array " +min);
		
		
		
		
		
		
		
		
		
		
		
	}

}
