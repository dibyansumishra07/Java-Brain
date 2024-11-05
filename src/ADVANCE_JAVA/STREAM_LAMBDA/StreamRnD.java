package ADVANCE_JAVA.STREAM_LAMBDA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
		Stream<String> stream= Stream.of("A","B","C","D");
		// map.values().stream().peek(System.out::println).forEach(System.out::println);
		System.out.println (stream.peek(System.out::println).findAny().orElse("NA"));

		//streamChatGptEx();

	}

	private static void streamChatGptEx() {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		names.stream()
				.filter(name -> name.startsWith("A"))
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}

}
