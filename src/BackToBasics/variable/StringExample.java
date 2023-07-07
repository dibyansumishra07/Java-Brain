package variable;

public class StringExample{

	String name = "John";
	int age;

	void print(String name) {
		System.out.print(name);
	}
	
	String replaceChars(String string)
	{
		String newString=string.replace('x', 'y');
		return newString;
	}

	public static void main(String[] args) {

		StringExample c1 = new StringExample();
		c1.print("xyz");
//		System.out.println(c1.replaceChars("xyz"));
	}
}