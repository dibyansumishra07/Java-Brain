package ADVANCE_JAVA.MULTI_THREADING.THREAD_COMMUNICATION;

class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int data) {
        // ! After consumer consumed the data, we are making it false. Until then nothing needs to produced CPU can take rest.
        while (hasData) {
            try {
                wait();// ! As data is already there we can wait no need to produce anything.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // ! Once data is consumed and loop will exit we will produce the data and notify consumer to consume the data.
        System.out.println("Produced: " + data);
        this.data = data;
        hasData = true;
        notify();
    }

    public synchronized int consume() {
        // ! Same here, until unless produced has not produced any data, we don't need to consume.
        while (!hasData) {
            try {
                wait();// ! Data not produced, wait here.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // ! Data produced, now we can consume.
        System.out.println("Consumed: " + data);
        // ! Once consumed, can mark the has data as false.
        hasData = false;
        // ! Notify producer that I have consumed. So that producer can produce again.
        notify();
        return data;
    }
}

class Producer implements Runnable {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = sharedResource.consume();
        }
    }
}


public class ThreadCommunicationConcept {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();
    }


}
