package PROBLEM_SOLVING.DSA.STRING;

public class DoNotRepeat3Times {
    public static String createString(int X, int Y) {
        StringBuilder result = new StringBuilder();

        // Track the counts of 'x' and 'y' left to add
        int countX = X;
        int countY = Y;

        while (countX > 0 || countY > 0) {
            int length = result.length();

            // Check the last three characters to avoid "xxxx" or "yyyy"
            boolean addX = true;
            if (length >= 3) {
                String lastThree = result.substring(length - 3);
                if (lastThree.equals("xxx")) {
                    addX = false; // Avoid adding 'x' if we already have "xxx"
                } else if (lastThree.equals("yyy")) {
                    addX = true; // Avoid adding 'y' if we already have "yyy"
                } else {
                    // Choose the character with the larger remaining count
                    addX = countX >= countY;
                }
            } else {
                // If length < 3, choose the character with the larger count
                addX = countX >= countY;
            }

            // Add the chosen character to the result
            if (addX && countX > 0) {
                result.append('x');
                countX--;
            } else if (!addX && countY > 0) {
                result.append('y');
                countY--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(createString(4, 2)); // Output example: "xxyxxy"
        System.out.println(createString(2, 2)); // Output example: "xyxy"
        System.out.println(createString(15, 1)); // Output example: "yyxyyy"
    }
}
