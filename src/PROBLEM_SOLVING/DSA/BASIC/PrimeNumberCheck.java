package PROBLEM_SOLVING.DSA.BASIC;

public class PrimeNumberCheck {
    public static void main(String args[]) {
        for (int i = 0; i < 50; i++) {
            isPrimeNumber(i);
        }
    }

    private static void isPrimeNumber(int number) {
        int i, modulus = 0;
        boolean flag = false;
        modulus = number / 2;
        // As per mathematics  & 1 is not a prime number
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        } else {
            // Starting with value 2 because all number will get divided with 1 and 0 will be INVALID
            for (i = 2; i <= modulus; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime number");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(number + " is prime number");
            }
        }//end of else
    }
}
