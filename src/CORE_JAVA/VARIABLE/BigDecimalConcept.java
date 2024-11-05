package CORE_JAVA.VARIABLE;

import java.math.BigDecimal;

/**
 * @author Dibyansu
 * @implNote Help to explore more about big decimal
 */
public class BigDecimalConcept {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal(500);
        BigDecimal y = BigDecimal.valueOf(500.00);
        System.out.println(x.compareTo(y));
        System.out.println(x + "," + y + "," + (x.floatValue() == y.floatValue()));
        // Ffdfd

    }
}