package PROBLEM_SOLVING.DSA.BASIC;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;  // Store the original number
        int reversedNumber = 0;  // Variable to store the reversed number

        // Reverse the digits of the number
        while (number != 0) {
            int lastDigit = number % 10;  // Extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Build the reversed number
            number /= 10;  // Remove the last digit from the original number
        }

        // Check if the original number is the same as the reversed number
        System.out.println(originalNumber == reversedNumber);
        return originalNumber == reversedNumber;
    }
}
