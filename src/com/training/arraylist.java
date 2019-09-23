package com.training;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
	
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(1);
		//al.add("vino");
		ar.add(200);
		
	/*	for(int i=0;i<al.size();i++)
		
			System.out.println(al.get(i));
		}
		*/
		
		for(int z :ar)
		{
			System.out.println(z);
		}
		

	}

}
