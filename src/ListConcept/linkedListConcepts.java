package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListConcepts {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("Java");
		ll.add("QTP");
		ll.add("Selenium");

		// print

		System.out.println("Contents of linked list: " + ll);

		// addfirst

		ll.addFirst("RFT");
		// addlast

		ll.addLast("Automation");

		System.out.println("Contents of linked list: " + ll);

		// get
		System.out.println(ll.get(0));

		// set

		ll.set(0, "vino");

		System.out.println("Contents of linked list: " + ll);

		// removefirst and removelast

		ll.removeLast();

		System.out.println("Contents of linked list: " + ll);

		ll.removeFirst();
		System.out.println("Contents of linked list: " + ll);

		// for loop
		System.out.println();
		System.out.println("*******FOR LOOP");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// advance for loop or for each
		System.out.println("*******FOREACH LOOP");

		for (String z : ll) {
			System.out.println(z);
		}

		// Iterator
		System.out.println("*******Iterator LOOP");

		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// while loop
		System.out.println("*******While LOOP");
		int i = 0;
		while (i < ll.size()) {
			System.out.println(ll.get(i));
			i++;
		}

	}

}
