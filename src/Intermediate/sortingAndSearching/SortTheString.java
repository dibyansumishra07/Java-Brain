package sortingAndSearching;

import java.util.Arrays;

public class SortTheString {
	
	public static void sortTheString(String string)
	{
		char[] toBeSorted=string.toLowerCase().toCharArray();
//		Arrays.sort(toBeSorted);
//		StringBuilder sortedStringBuilder=new StringBuilder(new String(toBeSorted));
//		System.out.println(sortedStringBuilder.reverse());

		for(int i=1; i< toBeSorted.length; i++){
			for(int j=0; j< toBeSorted.length; j++){
				if(toBeSorted[i] < toBeSorted[j]){
					char temp = toBeSorted[i];
					toBeSorted[i] = toBeSorted[j];
					toBeSorted[j] = temp;
				}
			}
		}
		StringBuffer sb = new StringBuffer(new String(toBeSorted));
		System.out.println(sb);
	}

	public static void main(String[] args) {
		
		
		sortTheString("yzhsfghadfhqfa");
		
	}

}
