package loop_conditions;

public class WhileLoopsExamples {

	public static void main(String[] args) {
		
		System.out.println(getNumber(2));
	}

	private static int getNumber(int i) {

		while(i<5)
		{
			i++;
		}
		return i;
	}

}
