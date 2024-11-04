package ADVANCE_JAVA.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		Iterator<Integer> itr=list.iterator();
		while (itr.hasNext()) {
			System.out.println("Sharma bola");
			list.add(9);
			
		}
	}

}
