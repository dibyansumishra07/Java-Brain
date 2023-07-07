package collectionFramrework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortArrayManually {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		int[][] mat = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };

		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5, 3);
//		Collections.sort(numbers);

		for (int i = 0; i < numbers.size(); i++) {

			for (int j = numbers.size() - 1; j > i; j--) {
				if (numbers.get(i) > numbers.get(j)) {

					int tmp = numbers.get(i);
					numbers.set(i,numbers.get(j));
					numbers.set(j,tmp);

				}

			}

		}
		for (int i : numbers) {
			System.out.println(i);
		}

	}

}
