package LatestJavaFeatures;

public class TextBlock {
//    Here instead of using /n /n we can directly use the """ """ and mention the desired format inside it and code will be executed like the same.
    private static final String text = """
                This is a multiline text block.
                It contains multiple lines.
                Each line is indented by four spaces.
                """;
    public static void main(String[] args) {

        System.out.println(text);
    }
}
