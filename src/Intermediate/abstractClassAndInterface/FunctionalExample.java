package Intermediate.abstractClassAndInterface;

@FunctionalInterface
public interface FunctionalExample {
	void show();
	default void show2() {
	}
	default void show3() {
		System.out.println("show3");
	}
	static void show4() {
	}
	static void show5() {
		System.out.println("show5");
	}
}
