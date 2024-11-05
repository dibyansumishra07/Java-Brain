package CORE_JAVA.OPERATORS;

public class ArithimaticOperatorsExamples {

	public static void main(String[] args) {
		int i=1, j=1;
		String string = "ABC";

		//post-increment first the current value: 1 and then the incremented value: 2
		System.out.println(i++ + " " +i);
		//pre-increment first the current value gets incremented: 2 and then the incremented current value: 2
		System.out.println(++j + " " +j);
		// Concatenation string and integer which will return a string value
        System.out.println(string+i);
	}

}
