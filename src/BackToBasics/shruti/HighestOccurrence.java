package shruti;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestOccurrence {

	public static void main(String[] args) {
		HighestOccurrence.checkHighestOccurrence("HEllloooooo");
	}
	
	static void checkHighestOccurrence(String value){
		char[] charArr = value.toCharArray();
		Map<Character, Integer> mapValue = new HashMap<>();
		
		for(char c: charArr) {
			mapValue.put(c, mapValue.containsKey(c) ? mapValue.get(c) + 1 : 1);
		}
		
		for(Map.Entry<Character, Integer> entry: mapValue.entrySet()) {
			if(entry.getValue().equals(Collections.max(mapValue.values()))) {
				System.out.println(entry.getKey() + " " +entry.getValue());
			}
		}
		 
	}
}
