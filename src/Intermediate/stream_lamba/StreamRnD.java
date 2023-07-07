package stream_lamba;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamRnD {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		// Using peek without any terminal
		// operation does nothing
		Stream stream= Stream.of("A","B","C","D");
		// map.values().stream().peek(System.out::println).forEach(System.out::println);
		System.out.println (stream.peek(System.out::println).findAny().orElse("NA"));
	}

}
