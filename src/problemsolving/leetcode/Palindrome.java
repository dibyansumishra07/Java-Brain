package problemsolving.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(121));
    }

    private static boolean isPalindrome(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    private static boolean isPalindrome(int i) {
        String s = Integer.toString(i);
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
