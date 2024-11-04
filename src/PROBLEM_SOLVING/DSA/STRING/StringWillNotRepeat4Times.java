package PROBLEM_SOLVING.DSA.STRING;

/*
 * Write a method that, given two integers X and Y, returns a string containing exactly X letters 'x'
 * and exactly Y letters 'y' such that no four consecutive letters are the same (in other words, neither "xxxx" nor "yyyy" may occur in the returned string).
 * Examples:
 * 1.	Given X = 4 and Y = 2, your function may return "xxyxxy". Note that "xxxyxy" would also be a correct answer. Your function may return any valid arrangement.
 * 2.	Given X = 2 and Y = 2, your function should return "xyxy", "yxxy", or any of several other valid combinations.
 * 3.	Given X = 3 and Y = 5, your function might return "yyxyyy", which is one of the valid solutions in this case.
 * */
public class StringWillNotRepeat4Times {

    public static final String X = "x";
    public static final String Y = "y";

    public static void main(String[] args) {
        generateString(3, 5);
        generateString(4, 2);
        generateString(2, 2);
    }

    /*
     * We can have a string with length total of x + y
     * We have to track the count of each x and y and decrease each once used
     * We have to run a loop until x or y is 0
     * First determine which element to be added whether it is X or Y
     * - create a flag for an element and will update it true false
     * */
    private static void generateString(int X, int Y) {
        int countX = X, countY = Y;
        boolean shouldAddX = true;
        StringBuilder resultString = new StringBuilder();
        while (countX > 0 || countY > 0) {
            // Check if we should add X and the count of x is not 0
            shouldAddX = countX > countY;
            if(shouldAddX){
                resultString.append("X");
                countX--;
            } else {
                resultString.append("Y");
                countY--;
            }
        }
        System.out.println(resultString);
    }
}
