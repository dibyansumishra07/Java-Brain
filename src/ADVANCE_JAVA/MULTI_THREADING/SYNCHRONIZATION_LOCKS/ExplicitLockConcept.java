package ADVANCE_JAVA.MULTI_THREADING.SYNCHRONIZATION_LOCKS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public int withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
//!        if(lock.tryLock()){ // Checking if locked by another thread then move to else part
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {//!Wait for some time period for unlock then either proceed or exit depends upon another thread
                if (amount <= balance) {
                    System.out.println(Thread.currentThread().getName() + " Withdrawing Amount: " + amount);
                    try {
                        Thread.sleep(10000);// Assuming that withdrawal process is taking time.
                        balance -= amount;
                        System.out.println("Transaction Completed Remaining Balance: " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();// Will let other threads know that this thread interrupted or can perform fallback operations upon interrupted lock
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance.");
                }
            } else {
                System.out.println(Thread.currentThread().getName()+" Unable to acquire lock. Try again later.");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return balance;
    }
    // ! Below was an example of automatic lock or intrinsic lock
//    public synchronized int withdraw(int amount) {
//        if (amount <= balance) {
//            System.out.println(Thread.currentThread().getName()+" Withdrawing Amount: "+ amount);
//            try {
//                Thread.sleep(10000);// Assuming that withdrawal process is taking time.
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            balance -= amount;
//            System.out.println("Transaction Completed Remaining Balance: "+ balance);
//        } else {
//            System.out.println(Thread.currentThread().getName()+" Insufficient Balance.");
//        }
//        return balance;
//    }
}

public class ExplicitLockConcept {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable runnable = () -> {
            sbi.withdraw(50);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}
