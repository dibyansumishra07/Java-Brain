package ADVANCE_JAVA.exceptionHandling.exceptionConcept;

import ADVANCE_JAVA.stream_lambda.streamWithComplexObjects.Product;

public class NullpointerExceptionEx {
    public static void main(String[] args) {
        Product p = null;
        assert p != null;
        System.out.println(p.getPrice());
    }
}
