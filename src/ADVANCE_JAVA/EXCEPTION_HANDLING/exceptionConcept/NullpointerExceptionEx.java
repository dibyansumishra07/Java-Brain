package ADVANCE_JAVA.EXCEPTION_HANDLING.exceptionConcept;

import ADVANCE_JAVA.STREAM_LAMBDA.streamWithComplexObjects.Product;

public class NullpointerExceptionEx {
    public static void main(String[] args) {
        Product p = null;
        assert p != null;
        System.out.println(p.getPrice());
    }
}
