package L3SinchronizedPart1;

public class l3SinchronizedPart1 {
    private int counter;
    
    public static void main(String[] args) {
        l3SinchronizedPart1 l3SinchronizedPart1 = new l3SinchronizedPart1();
        l3SinchronizedPart1.doWork();
    }
    
    public synchronized void increment(){
        counter++;
    }
    
    public void doWork() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
