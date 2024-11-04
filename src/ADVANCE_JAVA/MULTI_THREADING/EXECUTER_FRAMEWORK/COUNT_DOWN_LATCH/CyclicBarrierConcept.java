package ADVANCE_JAVA.MULTI_THREADING.EXECUTER_FRAMEWORK.COUNT_DOWN_LATCH;

import java.util.concurrent.*;

public class CyclicBarrierConcept {
    public static void main(String[] args) {
        int numberOfSubsystems = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(numberOfSubsystems, ()->{
            //! This is optional barrier action. This will execute after all threads are completed.
            System.out.println("All "+ numberOfSubsystems + " services are now up and running!".toUpperCase());
        });

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfSubsystems);
        Subsystem webServerThread = new Subsystem("WebServer", 4000, cyclicBarrier);
        Subsystem databaseThread = new Subsystem("Database", 5000, cyclicBarrier);
        Subsystem cacheThread = new Subsystem("Cache", 2000, cyclicBarrier);
        Subsystem messagingServiceThread = new Subsystem("Messaging Service", 1000, cyclicBarrier);

        executorService.submit(webServerThread);
        executorService.submit(databaseThread);
        executorService.submit(cacheThread);
        executorService.submit(messagingServiceThread);

        executorService.shutdown();
    }
}

class Subsystem implements Runnable{

    private String name;
    private int initializationTime;
    private CyclicBarrier cyclicBarrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier cyclicBarrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting "+name+" subsystem");
            Thread.sleep(initializationTime);// Assuming actual operation will take this much time.
            System.out.println("Started "+name+" subsystem");
            cyclicBarrier.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


