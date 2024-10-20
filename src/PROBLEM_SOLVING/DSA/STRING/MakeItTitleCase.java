package PROBLEM_SOLVING.DSA.STRING;

public class MakeItTitleCase {
    public static void main(String[] args) {
        System.out.println("Name in Title Case Is: " + convertFullNameIntoTitleCase("shruti manoj gupta"));
    }

    private static String convertFullNameIntoTitleCase(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(i==0){
                charArr[i]=Character.toUpperCase(charArr[i]);
            }
            if(Character.isWhitespace(str.charAt(i)))
            {
                charArr[i+1]=Character.toUpperCase(charArr[i+1]);
            }
        }
        return String.valueOf(charArr);
//        return new String(charArr);
//        return charArr.toString();
    }
}
