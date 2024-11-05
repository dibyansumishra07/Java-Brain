
package CORE_JAVA.ABSTRACT_INTERFACE;

interface A extends abstractClassAndInterface.MarkerInterfaceExample {
	default void show() {
		System.out.println("FROM A");
	}
	static void display() {
		System.out.println("A: display method");
	}
}

interface B extends A {
	
	default void show() {
		System.out.println("FROM B");
	}
	
	static void display() {
		System.out.println("B: display method");
	}
}

public class MultipleInheritance implements B {

	public static void main(String[] args) {
		B b = new MultipleInheritance();

		if (b instanceof abstractClassAndInterface.MarkerInterfaceExample) {
			System.out.println("Hann Haan me Marker ka beta hu");
		}
		b.show();
		A.display();
	}

}
