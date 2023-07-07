package shruti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListFilter {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Shruti", "Shru", "Didi", "Babu"));
		List value = list.stream().filter((val) -> val.startsWith("Sh")).collect(Collectors.toList());
		List mapValue = list.stream().map((v) -> v.concat("G")).collect(Collectors.toList());
		System.out.println(list + " " +value+ " " +mapValue);
		Map<Integer, String> map = new HashMap<>();
		int count=0;
		for(int i =1; i< 4; i++) {
			map.put(count++, "Shruti");
		}
	}
}
