package ADVANCE_JAVA.MULTI_THREADING.THREAD_FUNCTIONS;

public class ThreadFunctions extends Thread {

    public ThreadFunctions(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " PRIORITY "+ Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadFunctions tLOW = new ThreadFunctions("T1_LOW");
        ThreadFunctions tMED = new ThreadFunctions("T1_MED");
        ThreadFunctions tHIGH = new ThreadFunctions("T1_HIGH");

        tLOW.setPriority(Thread.MIN_PRIORITY);
        tMED.setPriority(Thread.NORM_PRIORITY);
        tHIGH.setPriority(Thread.MAX_PRIORITY);

//        tLOW.join();// * Wait for a thread to complete
        tLOW.start();// * Start a thread
        tLOW.start();// * Start a thread
        tLOW.start();// * Start a thread
        System.out.println("All Complete");
    }
}
