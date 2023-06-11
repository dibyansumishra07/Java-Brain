package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintNR {

	public static void main(String[] args) {

		printUniqueCharsFromAStringusingMap("RAMA");
	}
	

	private static void printUniqueCharsFromAStringusingMap(String string) {

		char[] words = string.toCharArray();

		Map<Character, Integer> check = new HashMap<>();

		for (char c : words) {

			check.put(Character.toUpperCase(c),
					check.containsKey(Character.toUpperCase(c)) ? check.get(Character.toUpperCase(c)) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> entry : check.entrySet()) {
			if (entry.getValue().equals(1))
				System.out.print(entry.getKey());
		}
	}

	static void removeDuplicateAndPrintUniqueCharsFromAStringusingStream(String string) {
		List<Character> chars = new ArrayList<>();
		for (char c : string.toCharArray()) {
			chars.add(Character.toUpperCase(c));
		}
		chars.stream().distinct().forEach(System.out::print);
	}

}
