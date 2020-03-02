public class Main {
    public static void main(String[] args) {
        FirstRacer firstRacer = new FirstRacer();
        Thread secondRacer = new Thread(new SecondRacer());

        firstRacer.start();
        secondRacer.start();
    }
}
