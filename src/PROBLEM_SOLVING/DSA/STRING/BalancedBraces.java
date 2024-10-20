package PROBLEM_SOLVING.DSA.STRING;

public class BalancedBraces {
    public static void main(String[] args) {
        String string = "{[()]}";
        System.out.println(isBalanced(string));
    }

    private static boolean isBalanced(String string) {
        int n = string.length();
        int[] intArray = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char c = string.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                intArray[++top] = c;
            } else if (c == ')' || c == ']' || c == '}') {
                if (top == -1 || (c == ')'
                        && intArray[top] != '(') || (c == ']'
                        && intArray[top] != '[') || (c == '}'
                        && intArray[top] != '{')) {
                    return false;
                }
                top--;
            }
        }

        return top == -1;
    }
}

