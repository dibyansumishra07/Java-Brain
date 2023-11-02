package Intermediate.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetsCompare {

	public static void main(String[] args) {
		
		List<Keyboards> keyboards=new ArrayList<>();
		
		keyboards.add(new Keyboards("logitech", 3000, "blue"));
		keyboards.add(new Keyboards("redgear", 2300, "blue"));
		keyboards.add(new Keyboards("cosmicbyte", 2200, "red"));
		
		Collections.sort(keyboards);
		
		for (Keyboards keyboards2 : keyboards) {
			System.out.println(keyboards2);
		}
	}

}
