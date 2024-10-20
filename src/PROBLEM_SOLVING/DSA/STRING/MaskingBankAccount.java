package PROBLEM_SOLVING.DSA.STRING;

public class MaskingBankAccount {
    public static void main(String[] args) {
        String accountNumber = "1234567890123456";
        String maskedAccountNumber = maskBankAccountNumber(accountNumber, 4, 8);
        System.out.println("Masked Account Number: " + maskedAccountNumber);
    }

    private static String maskBankAccountNumber(String accountNumber, int i, int i1) {
        StringBuilder maskedNumber = new StringBuilder();
        for (int j = 0; j < accountNumber.length(); j++) {
            if (j >= i && j < i1) {
                maskedNumber.append('*');
            } else {
                maskedNumber.append(accountNumber.charAt(j));
            }
        }
        return maskedNumber.toString();
    }
}
