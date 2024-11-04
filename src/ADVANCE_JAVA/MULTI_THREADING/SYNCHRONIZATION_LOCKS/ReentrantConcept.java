package ADVANCE_JAVA.MULTI_THREADING.SYNCHRONIZATION_LOCKS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantConcept {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();// ! Locking main thread
        try {
            System.out.println("OUTER METHOD");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        // ! The main thread is already locked in outer method and we are trying again to lock it.
        // ! This should occur deadlock but Reentrant lock internally handles the scenario/
        // ! The lock is reentrant name itself says that we can re enter into the lock.
        lock.lock();
        try {
            System.out.println("INNER METHOD");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantConcept reentrantConcept = new ReentrantConcept();
        reentrantConcept.outerMethod();
    }
}
