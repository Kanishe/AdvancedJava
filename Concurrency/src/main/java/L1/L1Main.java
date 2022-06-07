package L1;

public class L1Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new L1Thread());
        Thread thread2 = new Thread(new L1Thread());
        thread.start();
        thread2.start();
        try {
            Thread.sleep(5000);
            System.out.println("Sleeep");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
