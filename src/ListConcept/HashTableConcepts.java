package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {

	public static  void main(String[] args) {

		// similar to hashmap, its synchronised
		//stores the value on basis of key -val
		// key--> object -- HashCode-->value
		
		
		Hashtable h1= new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Java");
		h1.put(3, "Selenium");
		
		//copy
		Hashtable h2= new Hashtable();
		
		h2=(Hashtable)h1.clone();
		System.out.println("The Values from h1" +h1);
		System.out.println("The Values from h2" +h2);
		
		h1.clear(); // h1 will be deleted fully, h2 reamain same.
		
		System.out.println("The Values from h1" +h1);
		System.out.println("The Values from h2" +h2);
		
		
		// contains value
	
		System.out.println("_________contains");
		
		Hashtable st= new Hashtable();
		st.put("A", "Vino");
		st.put("B", "Deva");
		st.put("C", "Raju");
		
		if(st.containsValue("vino")){
			System.out.println("value is found");
		}else{
			System.out.println("value Not found");
			
		}
			
		System.out.println();
		System.out.println("_________Print the values ");
		
		// using enum --elements
		
		Enumeration e=st.elements();
		System.out.println("Print values form st using enumeration:");
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		System.out.println();
		
		//using entrySet()
		
		System.out.println("Print values form st using entryset:");		
		
	Set s= st.entrySet();
	System.out.println(s);
	
	
	Hashtable<String, String> st1= new Hashtable <String, String> ();
	st1.put("A", "Vino");
	st1.put("B", "Deva");
	st1 .put("C", "Raju");
	st1 .put("C", "Raju"); // it contains only unique values
	//st1 .put("C", null); // throws nul pointer exceptiom
	//st1 .put(null, null); // no null and no null values
	
	
	//Check both the hashtable
	System.out.println();
	System.out.println("Print Equal values ");		

	if(st.equals(st1)){
		System.out.println("Both are equal");
	}
		
	// get the value from a key 
	
	System.out.println(st1.get("B"));
	
	// GET the hashcode
	System.out.println(st1.hashCode());
	
	
		
		
	}

}
