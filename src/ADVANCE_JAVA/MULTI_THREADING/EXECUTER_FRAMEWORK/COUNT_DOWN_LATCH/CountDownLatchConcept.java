package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK.COUNT_DOWN_LATCH;

import java.util.List;
import java.util.concurrent.*;

public class CountDownLatchConcept {
    public static void main(String[] args) {
        int numberOfTask = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfTask);
        CountDownLatch countDownLatch = new CountDownLatch(numberOfTask);
        DependentServiceWithCountDownLatch task1 = new DependentServiceWithCountDownLatch(countDownLatch);
        DependentServiceWithCountDownLatch task2 = new DependentServiceWithCountDownLatch(countDownLatch);
        DependentServiceWithCountDownLatch task3 = new DependentServiceWithCountDownLatch(countDownLatch);

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        try {
//            countDownLatch.await();// ! Main thread will wait until countdown is 0.
            countDownLatch.await(5, TimeUnit.SECONDS);// ! Main thread will wait until countdown is 0 or Given time limit which is 5 second.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        executorService.shutdown();// ! This will not stop the thread tasks, just allowing main thread to not wait.
        executorService.shutdownNow();// ! This is will totally stop all thread operation and main thread will continue.
        System.out.println("Tasks are completed. Service is shutting down!");
    }
}

class DependentServiceWithCountDownLatch implements Callable<String> {

    private final CountDownLatch countDownLatch;

    public DependentServiceWithCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " Dependent Service Started!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            countDownLatch.countDown();
        }
        return Thread.currentThread().getName() + " Dependent Service Executed.";
    }
}
