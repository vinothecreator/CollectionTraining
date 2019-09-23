package com.training.collection;

public class arrray {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 25;
		arr[1] = 45;
		arr[2] = 65;
		arr[3] = 85;
		arr[4] = 105;
		
		

		// traditional for  loop 
	/*	int size = arr.length;
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		//for each loop
		
		for(int x:arr)
		{
			System.out.println(x);
		}

	}

}
