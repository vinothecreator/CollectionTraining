package ListConcept;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;




public class Temp {

	public static void main(String[] args) {
	
     /* Scanner input = new Scanner(System.in);
         
         System.out.println("Enter the int");*/
		

		
		int  numbers[] ={10,20,60,90,30};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest = numbers[i];
			}
		else if(numbers[i]< smallest){
			smallest = numbers[i];
		}
		}
			
			System.out.println("all values:"+ Arrays.toString(numbers));
			System.out.println(largest);
			System.out.println(smallest);
		

		}
	
	
	
		
			
		}
		
         

	
	

