package collectionFramrework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListInterfaceExamples {

	public static void main(String[] args) {

//		checkArrayList();
		checkStack();
	}

	private static void checkArrayList() {
		List<String> names=new ArrayList<>();
		names.add("Shruti");
		names.add("Sid");
		names.add("Simu");
		names.add("Janaki");
		names.add("Rekha");
		names.add("manoj k gupta");
		names.add(null);
		names.add(null);
		
		if(names.contains("Shruti"))
		{
			System.out.println("I can find Shruti in this list");
			System.out.println("Shruti ko mujh pr bhaorsa he wo bachi he");
		}
		else
		{
			System.out.println("I can NOT find Shruti in this list");
		}
		
		Iterator<String> familyNames=names.iterator();
		
		while(familyNames.hasNext())
		{
			System.out.println(familyNames.next());
		}
	}

	private static void checkStack()
	{
		Stack<Integer> stack=new Stack<>();
		stack.add(1);
		stack.add(1);
		stack.add(1);
		stack.add(null);
		stack.add(null);
		
Iterator<Integer> familyNames=stack.iterator();
		
		while(familyNames.hasNext())
		{
			System.out.println(familyNames.next());
		}
	}
}
