package PROBLEM_SOLVING.DSA.STRING;

import java.io.IOException;

public class CamelCaseWordCount {


    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        char[] stringArr=s.toCharArray();
        int charCount=1;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i))){
                charCount++;
            }
        }
        return charCount;
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        int result = CamelCaseWordCount.camelcase(s);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(CamelCaseWordCount.camelcase("TestWord"));
    }

}
