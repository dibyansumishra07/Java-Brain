package OOPS;

import java.time.LocalDate;

@FunctionalInterface
interface Square {
    int calculateValue(int x);
}
public class Calculate {
    public static void main(String[] args) {
        int a = 10;
        Square s = (int x) -> x * x;

        int val = s.calculateValue(a);
        System.out.println("Answer is: "+ val);

        boolean checkLeapYear = LocalDate.parse("2015-06-12").isLeapYear();
        if(checkLeapYear)
            System.out.println("is a leap year");
        else
            System.out.println("is not a leap year");
    }
}
