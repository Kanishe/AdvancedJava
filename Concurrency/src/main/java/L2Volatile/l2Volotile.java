package L2Volatile;

public class l2Volotile extends Thread  {
    public volatile boolean running = true;// volatile - не кешируется для каждого потока а берется тз
    //общей памяти
    
    @Override
    public void run() {
        while (running) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
            
        }
    }
    
    public void shutdown() {
        this.running = false;
    }
}
