package Threads;

public class Multithreaddemo {
    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        t1.setName("Thread 1");

        t1.start();  // start thread

        try {
            t1.join(); // main waits for t1 to finish
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Output is hello (from main)");
    }
}