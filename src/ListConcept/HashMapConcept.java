package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		/*
		 * Points to remember : 1. HashMap is a class implements Map Interface
		 * 2. extends AbstractMap 3.It contains only unique elements 4.stores
		 * the value - Key- value pair 5.It may have one null key and multiple
		 * null values 6.it maintains no order 7.it is non - synchronosed -- No
		 * Thread safe 8. Concurrent modification exception - fail- fast-
		 * Execution. 9. if we remove the key, key will be removed completely
		 * but it will not shift the key
		 */

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "jAVA");
		hm.put(4, null); //  It may have one null key and multiple  null values

		// System.out.println(hm.entrySet());

		System.out.println(hm.get(4));

		// Iterate the valeus

		for (Entry<Integer, String> m : hm.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hm);

		System.out.println("_____REMOVE__");
		hm.remove(2); // order wont change only key 2 deleted
		System.out.println(hm);

		System.out.println("\n");

		System.out.println("___ Traverse the values");

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		// ctrl+shift+f  = auto formatter
		
		
		Employee e1 = new Employee("kannan", 26, "Admin");
		Employee e2 = new Employee("Kumar", 28, "QA");
		Employee e3 = new Employee("Raju", 27, "RFT");
		Employee e4 = new Employee("Jithu", 22, "DEV");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);

		// traverse the hashmap

		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();

			System.out.println("Employee " + key + " Info :");

			System.out.println(e.name + " " + e.age + " " + e.dept);

		}

	}

}
