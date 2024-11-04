package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK;

public class FactorialUsingThreads {
    public static void main(String[] args) {
        findFactorial(9);

    }

    private static void findFactorial(int till) {
        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[till-1];
        for (int i = 1; i < till; i++) {
            int finalI = i;
            threads[i - 1] = new Thread(()->{
                long result = calculateFactorial(finalI);
                System.out.println(result);
            });
            threads[i-1].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total Time Consumed: "+ (System.currentTimeMillis()-startTime));

    }

    private static long calculateFactorial(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int j = 1; j < i; j++) {
            result *= j;
        }
        return result;
    }
}
