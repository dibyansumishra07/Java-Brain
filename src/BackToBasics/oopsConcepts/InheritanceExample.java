package BackToBasics.oopsConcepts;

abstract class A {
	int x ;

	public abstract void sendMessage();

	public static void main(String[] args) {

		A ie = new InheritanceExample();
		ie.x=9;
		ie.sendMessage();
	}
}

public class InheritanceExample extends A {

	@Override
	public void sendMessage() {
		System.out.println("Send  " );
	}
}
