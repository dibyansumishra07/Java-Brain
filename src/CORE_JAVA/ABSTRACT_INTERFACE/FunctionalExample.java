package CORE_JAVA.ABSTRACT_INTERFACE;

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

    private void show6() {
        System.out.println("show5");
    }
}
