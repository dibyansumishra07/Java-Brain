package ADVANCE_JAVA.LATEST_JAVA_FEATURES;

public class TextBlock {
    //    Here instead of using /n /n we can directly use the """ """ and mention the desired format inside it and code will be executed like the same.
//    private static final String text = """
//                This is a multiline text block.
//                It contains multiple lines.
//                Each line is indented by four spaces.
//                """;
    static String name = "John";
    static int age = 30;
    /*
        Common Format Specifiers:
                %s – String
    %d – Decimal (integer) number
    %f – Floating point number
    %x – Hexadecimal number
    %n – Platform-specific newline (useful for cross-platform compatibility)*/
    // Use String.format to inject variables into the text block
    private static final String text = String.format("""
            This is a multiline text block.
            Hello, %s! You are %s years old.
            It contains multiple lines.
            """, name, age);

    public static void main(String[] args) {
        System.out.println(text);
    }
}
