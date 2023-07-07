package stream_lamba;

import java.util.List;
import java.util.stream.Collectors;

public class FindEven {

	public static void main(String[] args) {

		List<String> n = List.of("2", "3", "4", "5", "78");
		List<String> nDUA = List.of("13","21","16");
		List<Integer> ndiby= List.of(13,21,16,111,111,11111,2111111);

		ndiby.stream().filter(i->i.toString().startsWith("1")).forEach(System.out::println);
//		nDUA.stream().filter(i->i.startsWith("1")).forEach(System.out::println);
//		n.stream().map(Integer::parseInt).filter(i -> i % 2 == 0)
//				.collect(Collectors.toList()).forEach( System.out::println);


	}

}
