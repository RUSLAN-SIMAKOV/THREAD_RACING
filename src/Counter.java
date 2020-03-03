public class Counter {

    public static void incrementCounter() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%s Racer   %d \n", Thread.currentThread(), i);
        }
    }
}
