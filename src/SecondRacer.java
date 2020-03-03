public class SecondRacer implements Runnable {

    public SecondRacer() {
        System.out.println("SecondRacer is running");
    }

    @Override
    public void run() {
        try {
            Counter.incrementCounter();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}
