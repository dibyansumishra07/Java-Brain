package fun;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LetsDecide {
	public static String getRandomDecesion(List<String> decisions) {

		Random random = new Random();
		return decisions.get(random.nextInt(decisions.size()));
		

	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		List<String> decesions = new ArrayList<>();
//		System.out.println("How much decision do you have: ");
//		int decisionCount = sc.nextInt();
//		for (int i = 0; i < decisionCount; i++) {
//			System.out.println("Enter" + (i + 1) + " decesion: ");
//			decesions.add(sc.next());
//		}

		decesions.add("MUM");
		decesions.add("HYD");
		decesions.add("BGLR");
	
		System.out.println(LetsDecide.getRandomDecesion(decesions));

	}

}
