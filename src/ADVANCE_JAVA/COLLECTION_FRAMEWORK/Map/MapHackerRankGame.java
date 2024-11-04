package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


class Bowling {
	HashMap<String, Integer> players;

	Bowling() {
		players = new HashMap<String, Integer>();
	}

	public void addPlayer(String name, int p) {
		players.put(name, p);
	}

	public void getWinner()
    {
		Collection<Integer> points=players.values();
		int maxvalue=Collections.max(points);
		
		if(players.containsValue(maxvalue))
		{
			for (Map.Entry<String,Integer> entry : players.entrySet()) {
				if(Objects.equals(entry.getValue(), maxvalue))
				{
					String winner=entry.getKey();
					System.out.println(winner);
				}
			}
		}
    	
    }
}

public class MapHackerRankGame {

	public static void main(String[] args) {
		Bowling game = new Bowling();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			game.addPlayer(name, points);
		}
		game.getWinner();
		sc.close();

	}
}
