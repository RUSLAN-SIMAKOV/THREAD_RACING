public class FirstRacer extends Thread {

    public FirstRacer() {
        System.out.println("FirstRacer is running");
    }

    public void run() {
        try {
            Counter.incrementCounter();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}
