package stream_lamba;
@FunctionalInterface
interface A {
	void show();
	default void show(int i)
	{
		
	}
}

public class LambdaExample {

	public static void main(String[] args) {

		A a;
		a=()->System.out.println("Hi");
				
	a.show();
	}
	
}
