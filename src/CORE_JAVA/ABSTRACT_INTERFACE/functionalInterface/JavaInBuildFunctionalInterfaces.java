package CORE_JAVA.ABSTRACT_INTERFACE.functionalInterface;

import java.util.function.*;

public class JavaInBuildFunctionalInterfaces {
    public static void main(String[] args) {
        /*
         * Function functional interface takes two generic one as input and other as output
         * We can do any operation but have to return the result.
         * */
        Function<String, String> lengthFunction = (s) -> {
            if (3 < s.length()) {
                s = "Large String: " + s;
            } else {
                s = "Small String: " + s;
            }
            return s;
        };
        System.out.println(lengthFunction.apply("Hello")); // Output: 5

        BiFunction<Integer, Integer, Boolean> sum = (a, b) -> (a + b) % 2 == 0;
        System.out.println(sum.apply(3, 4)); // Check if sum is boolean or not

        /*
        * This is a similar kind of Function functional interface but returns void
        * */
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello World"); // Output: Hello World
        BiConsumer<String, Integer> printKeyValue = (key, value) -> System.out.println(key + ": " + value);
        printKeyValue.accept("Age", 30); // Output: Age: 30
        /*
        * Predicate functional interface takes one generic as input and returns boolean
        * */
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        BiPredicate<Integer, Integer> isGreater = (x, y) -> x > y;
        System.out.println(isGreater.test(5, 3)); // Output: true
        /*
        * Supplier
        * */
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get()); // Output: Hello


    }
}
