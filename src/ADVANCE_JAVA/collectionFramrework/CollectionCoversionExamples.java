package collectionFramrework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionCoversionExamples {

	public static Set<Integer> convertListToSet(List<Integer> list, String algoType) {
//		Iterating and adding each element in a new hash set
		Set<Integer> setFromList = new HashSet<>();

		if (algoType.equals("NORMAL")) {
			System.out.println("Using Regular approach and adding the elements into hash set");
			for (Integer integer : list) {
				setFromList.add(integer);
			}
		}
//		Passing the collection list in hashset contructer 
		else if (algoType.equals("CONSTRUCTER")) {
			System.out.println("Using the hash set constructer to convert");
			setFromList = new HashSet<>(list);
//			setFromList.addAll(list);
			System.out.println(setFromList);
		}

//		Using stream function to 
		else if (algoType.equals("STREAM")) {
			System.out.println("SUing Stream functionality");
			setFromList = list.stream().collect(Collectors.toSet());
		}
		return setFromList;
	}
	
	public static Map<Integer, Integer> convertListToMap(List<Integer> list, String mode)
	{
		Map<Integer, Integer> mapFromList=new HashMap<>();
		
		if (mode.equals("BASIC")) {
			for (Integer integer : list) {
				mapFromList.put(integer, integer);
			}
			System.out.println(mapFromList);
		}
		else if(mode.equals("STREAM"))
		{
//			list.stream().collect(Collectors.toMap(list.get(1)));
		}
		return mapFromList;
	}
	
	public static List<Integer> convertSetToList(Set<Integer> set, String mode)
	{
		List<Integer> listFromSet=new ArrayList<>();
		
		
		
		return listFromSet;
	}

	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);

		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);

//		System.out.println(list);
//		list.forEach(i->System.out.println(i));
//		System.out.println(set);
//		System.out.println(map);

//		List to Set
		
		convertListToSet(list,"CONSTRUCTER");
		convertListToMap(list,"abc");

	}

}
