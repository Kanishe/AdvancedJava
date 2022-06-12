package L4SinchronizedPart2;

public class L4SinchronizedPart2 {
    private int counter;
    
    public static void main(String[] args) {
        L4SinchronizedPart2 l4SinchronizedPart2 = new L4SinchronizedPart2();
        l4SinchronizedPart2.count();
    
    }
    
    public void sinchCount(){
        synchronized (this){
            counter++;
        }
        
    }
    
    public void count() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
            
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
            
            }
        });
        
        thread1.start();

        thread2.start();
        
        
    }
}
