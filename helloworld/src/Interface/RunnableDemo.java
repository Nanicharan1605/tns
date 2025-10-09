package Interface;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnablex r1 = new Runnablex(); // Create Runnable object
        Thread t1 = new Thread(r1);     // Pass it to a Thread
        t1.start();                     // Start the thread
    }
}
