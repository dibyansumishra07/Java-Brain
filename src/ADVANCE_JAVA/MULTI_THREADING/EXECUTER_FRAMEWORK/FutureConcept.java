package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK;

import java.util.concurrent.*;

public class FutureConcept {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> 42);
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}
