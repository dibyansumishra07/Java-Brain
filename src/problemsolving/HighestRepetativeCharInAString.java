package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestRepetativeCharInAString {

	public static void main(String[] args) {

		String str = "Hellllllloooo World";

//		printHighestRepetativeCharInAStringUsingHashmap(str);
		printHighestRepetativeCharInAStringUsingHashmap(str);

	}

	private static void printHighestRepetativeCharInAString2(String str) {
		/* Convert string to char array 
		 * Declare 
		 * */
		
		Map<Character, Integer> map = new HashMap<>();
		Map.Entry<Character, Integer> maxEntry = null;

		char[] strToArray = str.toCharArray();
		for (Character c : strToArray) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		System.out.println(maxEntry.getKey());
		System.out.println(maxEntry.getValue());
	}

	private static void printHighestRepetativeCharInAStringUsingHashmap(String str) {
		/*
		 * converting string into char array
		 * creating empty map to key as each character of that string and value will be the count
		 * iterating over character array to put va and 
		 */
		char[] strToArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (Character c : strToArray) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(Collections.max(map.values()))) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
		}
	}

	private static void printHighestRepetativeCharInAStringUsingHashmapWithOneForLoop(String str)
	{
		char[] strToArray = str.toCharArray();
		List<Character> chars = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : strToArray) {
			chars.add(c);
		}
		for (Character c : chars) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
//		Map.Entry<Character, Integer> maxEntry=
	}
}
