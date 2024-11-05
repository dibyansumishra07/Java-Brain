package CORE_JAVA.VARIABLE;

public class BooleanExample {

	public static void main(String[] args) {
		boolean x=true;
		Boolean wrapperBoolean = true;
		Boolean wrapperBooleanObject = new Boolean(true);
		System.out.println(wrapperBoolean==wrapperBooleanObject);
		System.out.println(wrapperBoolean.equals(wrapperBooleanObject));

	}

}
