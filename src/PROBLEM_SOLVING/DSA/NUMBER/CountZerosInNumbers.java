package PROBLEM_SOLVING.DSA.NUMBER;

public class CountZerosInNumbers {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 3050; i++) {
            int currentNum = i;

            while (currentNum > 9) {
                if (currentNum % 10 == 0) {
                    System.out.print(i + "-");
                    counter++;
                }
                currentNum = currentNum / 10;
            }

        }

        System.out.println();
        System.out.println(counter);
    }
}
