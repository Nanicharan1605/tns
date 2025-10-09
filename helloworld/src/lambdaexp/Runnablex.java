package Interface;

public class Runnablex implements Runnable {

    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(2000); // 2-second delay
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
