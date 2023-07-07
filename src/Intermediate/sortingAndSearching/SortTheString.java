package sortingAndSearching;

import java.util.Arrays;

public class SortTheString {
	
	public static void sortTheString(String string)
	{
		char[] toBeSorted=string.toLowerCase().toCharArray();
		Arrays.sort(toBeSorted);
		StringBuilder sortedStringBuilder=new StringBuilder(new String(toBeSorted));
		System.out.println(sortedStringBuilder.reverse());
	}

	public static void main(String[] args) {
		
		
		sortTheString("XYZ");
		
	}

}
