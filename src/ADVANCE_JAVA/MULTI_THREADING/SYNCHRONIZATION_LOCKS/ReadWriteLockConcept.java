package ADVANCE_JAVA.MULTI_THREADING.SYNCHRONIZATION_LOCKS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteCounter {
    private int counter;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock writeLock = readWriteLock.writeLock();
    private final Lock readLock = readWriteLock.readLock();

    public void increment() {
        writeLock.lock();
        try {
            counter++;
            Thread.sleep(50);// ! Here write will sleep and read will get a chance to execute. But no guarantee
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            writeLock.unlock();
        }
    }

    public int getCounter() {
        // ! Write and Read lock communicate with each other and multiple read operation can happen.
        // ! Condition is write lock is acquired any lock. While writing read operation will be on hold.
        readLock.lock();
        try {
            return counter;
        } finally {
            readLock.unlock();
        }

    }

}

public class ReadWriteLockConcept {
    public static void main(String[] args) {
        ReadWriteCounter readWriteCounter = new ReadWriteCounter();
        Runnable readRun = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " got counter value as " +readWriteCounter.getCounter());
            }
        };
        Runnable writeRun = () -> {
            for (int i = 0; i < 10; i++) {
                readWriteCounter.increment();
                System.out.println(Thread.currentThread().getName() + " Counter incremented by 1 ");
            }
        };

        Thread writeThread = new Thread(writeRun);
        Thread readThread1 = new Thread(readRun);
        Thread readThread2 = new Thread(readRun);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        System.out.println();

    }
}
