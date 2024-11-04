package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK.COUNT_DOWN_LATCH;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingWithoutCountDownLatch {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        DependentService task1 = new DependentService();
        DependentService task2 = new DependentService();
        DependentService task3 = new DependentService();

        List<DependentService> tasks = List.of(task1, task2, task3);
        List<Future<String>> futures;
        try {
            futures = executorService.invokeAll(tasks);// ! This will also stop code execution or main thread.
            // ! For n number of threads the loop will iterate and hold main thread. This might be unmaintainable in high concurrent environment.
            // ! The requirement is simple make MAIN thread to wait until tasks are completed.
            for (Future<String> future : futures) {
                System.out.println(future.get());// ! This is also stopping code execution or main thread,
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
        System.out.println("Tasks are completed. Service is shutting down!");
    }
}

class DependentService implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " Dependent Service Started!");
        return Thread.currentThread().getName()+ " Dependent Service Executed.";
    }
}
