package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FactorialUsingExecutorFramework {
    public static void main(String[] args) {
        findFactorial(10);

    }

    private static void findFactorial(int till) {
        long startTime = System.currentTimeMillis();

//        Thread[] threads = new Thread[till-1];
        ExecutorService executorService = Executors.newFixedThreadPool(till-7);
        for (int i = 1; i < till; i++) {
            int finalI = i;
            executorService.submit(()->{
                long result = calculateFactorial(finalI);
                System.out.println(result);
            });
        }

        executorService.shutdown();// ! JVM will continue to run, if not called.
        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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
