package collectionFramrework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindRepetativeElement {

	public static void main(String[] args) {
		List<Integer> listContainingDuplicateValue=Arrays.asList(11,12,13,11,14,11,14,12);
		
		Map<Integer, Integer> freqMap=new HashMap<>();
		
		for (Integer integer : listContainingDuplicateValue) {
			if(freqMap.containsKey(integer))
			{
				freqMap.put(integer, freqMap.get(integer)+1);
			}
			else
			{
				freqMap.put(integer, 1);
			}
		}
		for (Entry<Integer, Integer> entry: freqMap.entrySet()) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" and repeted by "+entry.getValue()+ " times");
			}
		}
	}

}
