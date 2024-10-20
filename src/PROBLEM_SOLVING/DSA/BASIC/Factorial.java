package PROBLEM_SOLVING.DSA.BASIC;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        factorial(number);
    }

    private static void factorial(int number) {

        if (number < 0){
            System.out.println("Invalid Number");
        }
        else if (number == 0 || number == 1) {
            System.out.println("Factorial of " + number + " is 1");
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + number + " is "+result);
        }
    }
}
