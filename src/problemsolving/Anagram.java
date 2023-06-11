package problemsolving;

import java.util.Arrays;

public class Anagram {

	public  static  void main(String[] check) {
		System.out.println(checkAnagram("ABBCc", "CABBC"));
	}

	protected static boolean checkAnagram(String string, String string2) {
		char[] stringArr = string.toCharArray();
		char[] string2Arr = string2.toCharArray();

		Arrays.sort(stringArr);
		Arrays.sort(string2Arr);

		if (stringArr.length != string2Arr.length)
			return false;

		for (int i = 0; i < stringArr.length; i++)
			if (Character.toUpperCase(stringArr[i]) != Character.toUpperCase(string2Arr[i]))
				return false;

		return true;

	}

}


