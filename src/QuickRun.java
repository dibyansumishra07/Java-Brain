public class QuickRun{

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result = 1;
        for (int i = 1; i < 500; i++) {
            result *= i;
        }
        System.out.println("Factorial Got: "+result+" in "+(System.currentTimeMillis()-startTime));
    }
}
