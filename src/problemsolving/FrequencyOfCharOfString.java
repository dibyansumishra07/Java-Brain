package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharOfString {

	public static void main(String[] args) {
		checkFrequencyOfEachCharInAString("AABBCCCCCCCCDEFGHBVT");
	}

	private static void checkFrequencyOfEachCharInAString(String string) {
		char[] charArr=string.toCharArray();
		Map<String, Integer> counter=new HashMap<>();
		
		for (char c : charArr) {
			if(counter.containsKey(Character.toString(c)))
			counter.put(Character.toString(c), counter.get(Character.toString(c))+1);
			else
			counter.put(Character.toString(c), 1);
		}
		for (Map.Entry<String, Integer> entry: counter.entrySet()) {
			System.out.println(entry.getKey()+" is present"+entry.getValue()+" times in the string.");
		}
		
	}

}
