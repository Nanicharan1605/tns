package Threads;


class Multithreading extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);

            if (i == 3) {
                Thread.yield(); // hint scheduler to switch threads
            }

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
