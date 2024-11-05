package ADVANCE_JAVA.LATEST_JAVA_FEATURES;

public class HelpFullNullPointer {
    public static void main(String[] args) {
        String s = null;
        // NullPointerException will be thrown here but now instead of saying only the line number we will get the RCA of that null pointer.
        System.out.println(s.length());
    }

}
