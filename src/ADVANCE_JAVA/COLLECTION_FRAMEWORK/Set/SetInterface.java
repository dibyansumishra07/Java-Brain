package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

//		 checkHashSet();
//		checkLinkedHashSet();
		checkTreeSet();
	}

	private static void checkHashSet() {
		Set<Integer> intSet = new HashSet<>();

		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
		intSet.add(6);
		intSet.add(7);
		intSet.add(null);
		intSet.add(null);

		Iterator<Integer> familyNames = intSet.iterator();

		while (familyNames.hasNext()) {
			System.out.println(familyNames.next());
		}
	}

	private static void checkLinkedHashSet() {
		Set<Integer> intSet = new LinkedHashSet<>();

		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(null);
		intSet.add(null);

		Iterator<Integer> familyNames = intSet.iterator();

		while (familyNames.hasNext()) {
			System.out.println(familyNames.next());
		}
	}
	private static void checkTreeSet() {
		Set<Integer> intSet = new TreeSet<>();
		
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(null);
		intSet.add(null);
		
		Iterator<Integer> familyNames = intSet.iterator();
		
		while (familyNames.hasNext()) {
			System.out.println(familyNames.next());
		}
	}

}
