package shruti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListFilter {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Shruti", "Shru", "Didi", "Babu"));
		List<String> value = list.stream().filter((val) -> val.startsWith("Sh")).toList();
		List<String> mapValue = list.stream().map((v) -> v.concat("G")).toList();
		System.out.println(list + " " +value+ " " +mapValue);
	}
}
