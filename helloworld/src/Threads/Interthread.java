package Threads;

public class Interthread {
    public static void main(String[] args) throws InterruptedException {
        final Object obj = new Object();

        // Runnable for waiting threads
        Runnable waiter = () -> {
            synchronized (obj) {
                try {
                    System.out.println(Thread.currentThread().getName() + " : waiting");
                    obj.wait();
                    System.out.println(Thread.currentThread().getName() + " : resumed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Two waiting threads
        Thread t1 = new Thread(waiter, "Waiting-1");
        Thread t2 = new Thread(waiter, "Waiting-2");

        t1.start();
        t2.start();

        // Give waiters time to start
        Thread.sleep(1000);

        // Thread to notify one waiter
        Thread notifier = new Thread(() -> {
            synchronized (obj) {
                System.out.println("Notifier -> calling notify()");
                obj.notify(); // wakes one waiting thread
            }
        }, "Notifier");

        notifier.start();
        notifier.join();

        Thread.sleep(1000);

        // Thread to notify all remaining waiters
        Thread notifierAll = new Thread(() -> {
            synchronized (obj) {
                System.out.println("NotifierAll -> calling notifyAll()");
                obj.notifyAll(); // wakes all waiting threads
            }
        }, "NotifierAll");

        notifierAll.start();
        notifierAll.join();

        // Wait for waiting threads to finish
        t1.join();
        t2.join();

        System.out.println("Main -> done");
    }
}
