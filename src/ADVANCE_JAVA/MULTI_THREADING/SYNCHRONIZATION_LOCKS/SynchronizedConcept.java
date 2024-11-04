package ADVANCE_JAVA.MULTI_THREADING.SYNCHRONIZATION_LOCKS;

/*
 * We have use synchronized keyword here to make sure we are incrementing the counter in a sequence manner
 * Sharing common data need to be consistent across all the threads and that can be achieved synchronized block or method for critical sections.
 * */
class Counter {
    private int counter;

    public void incrementCounter(boolean isSynchronizedBlock) {
        synchronized (this) {
            counter++;
        }
    }

    public synchronized void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return this.counter;
    }
}

public class SynchronizedConcept {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementCounter();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementCounter(true);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println(counter.getCounter());
        }
    }
}
