public class SecondRacer implements Runnable {

    SecondRacer() {
        System.out.printf("SecondRacer is running \n");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("SecondRacer   %d \n",  i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("SecondRacer has been interrupted");
            }
        }
    }
}
