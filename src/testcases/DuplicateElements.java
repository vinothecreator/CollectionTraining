package testcases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "Java", "QTP", "JIRA", "C", "Ruby", "Java" };

		// 1.Compare each ele O(nxn) worst solution

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Element will be ::" + names[i]);
				}

			}
		}

		System.out.println("2nd solution");

		// using Hashset: java collection -- unique values :0(n)
		Set<String> store = new HashSet<String>();

		for (String z : names) {
			if (store.add(z) == false) {
				System.out.println("Duplicate Element will be ::" + z);
			}
		}

		System.out.println("3rd solution");

		Map<String, Integer> StoreMap = new HashMap<String, Integer>();

		for (String z : names) {
			Integer count = StoreMap.get(z);
			if (count == null) {
				StoreMap.put(z, 1);
			} else {
				StoreMap.put(z, ++count);

			}
		}

		// get the values from HashMap

		Set<Entry<String, Integer>> entrySet = StoreMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				System.out.println("Duplicate Element will be ::" + entry.getKey());
			}

		}

	}

}
