public class FirstRacer extends Thread {

    FirstRacer() {
        System.out.printf("FirstRacer is running \n");
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("FirstRacer   %d \n", i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("FirstRacer has been interrupted");
            }
        }
    }
}
