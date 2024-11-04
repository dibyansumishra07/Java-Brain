package ADVANCE_JAVA.MULTI_THREADING.BASIC;

class Hello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " Hello");// ! Thread Name
        }
    }
}

class World implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " World");// ! Thread Name
        }
    }
}


public class MainThread {
    // ! Main thread handles main method or Java Application.
    public static void main(String[] args) {
        Hello hello = new Hello();// * NEW STATE
        World world = new World();// * NEW STATE
        hello.start();// * RUNNABLE STATE
        new Thread(world).start();//* As this thread class implements runnable so passing in thread class constructor.

        // ! Using lambda directly creating thread using runnable
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println((Thread.currentThread().getName()+ " !"));
            }
        }).start();
    }
}
