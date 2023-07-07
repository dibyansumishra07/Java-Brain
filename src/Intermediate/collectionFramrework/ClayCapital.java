package collectionFramrework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClayCapital {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 10, 10, 20, 20, 20, 30, 30, 30, 30, 11, 23, 15);

		Map<Integer, Integer> check = new LinkedHashMap<>();

//		extracted(list, check);
		 list.stream().filter(e->e%2!=0).forEach(x->System.out.println(x));
		
	}

	private static void extracted(List<Integer> list, Map<Integer, Integer> check) {
		
			for (int x : list) {
				if (check.containsKey(x)) {
					check.put(x, check.get(x) + 1);
				} else {
					check.put(x, 1);
				}
			}

			for (Map.Entry<Integer, Integer> entry : check.entrySet()) {
				System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
			
		} 
		
		
	}

}
