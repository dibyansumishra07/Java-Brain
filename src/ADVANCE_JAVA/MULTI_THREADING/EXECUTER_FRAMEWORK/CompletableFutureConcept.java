package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureConcept {
    public static void main(String[] args) {

        // ! By default Completable future runs on daemon threads due to use of ForkJoinPool.commonPool
        CompletableFuture<String> workerThread = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Worker Thread");
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Inside Catch: LN 11");
            }
            return "All OK";
        });

        //! Creating executor service or pool, to provide completable future. It will now use daemon threads for the tasks.
        // ! Taking more control over threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletableFuture<String> workerThread2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Worker Thread");
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Inside Catch: LN 11");
            }
            return "All OK";
        }, executorService);// ! Here we have provided executor service. So that now this completable future will run in User thread not daemon thread.

//        try {
//            String s = workerThread.get();
//            System.out.println(s);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Main Thread LN 16");
    }
}
