package ADVANCE_JAVA.MULTI_THREADING.THREAD_LIFECYCLE;

public class MonitorLifecycle extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING_CUSTOM");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MonitorLifecycle mfThread = new MonitorLifecycle();
        System.out.println(mfThread.getState());// NEW
        mfThread.start();
        System.out.println(mfThread.getState());// RUNNABLE
        Thread.sleep(200);
        System.out.println(mfThread.getState());// TIMED_WAITING
        mfThread.join();// Wait fot this thread to finish and then proceed
        System.out.println(mfThread.getState());//

    }
}
