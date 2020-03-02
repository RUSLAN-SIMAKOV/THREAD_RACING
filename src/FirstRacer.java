public class FirstRacer extends Thread {

    FirstRacer() {
        System.out.printf("FirstRacer is running \n");
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("FirstRacer   %d \n", i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("FirstRacer has been interrupted");
            }
        }
    }
}
