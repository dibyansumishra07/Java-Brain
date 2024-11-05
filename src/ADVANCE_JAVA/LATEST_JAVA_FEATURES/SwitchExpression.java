package ADVANCE_JAVA.LATEST_JAVA_FEATURES;

public class SwitchExpression {
    public static void main(String[] args) {
        java8SwitchCase();
        java14SwitchCase();
    }

    private static void java8SwitchCase() {
        int number = 5;
        String result;

        switch (number) {
            case 1:
            case 2:
            case 3:
                result = "Small Number";
                break;
            case 4:
            case 5:
            case 6:
                result = "Medium Number";
                break;
            case 7:
            case 8:
            case 9:
                result = "Large Number";
                break;
            default:
                result = "Invalid Number";
                break;
        }

        System.out.println(result);
    }


    private static void java14SwitchCase() {
        int number = 5;
        String result = switch (number) {
            case 1, 2, 3 -> "Small Number";
            case 4, 5, 6 -> "Medium Number";
            case 7, 8, 9 -> "Large Number";
            default -> "Invalid Number";
        };

        System.out.println(result);
    }
}
