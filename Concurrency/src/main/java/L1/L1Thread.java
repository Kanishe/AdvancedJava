package L1;

public class L1Thread implements Runnable {
    int time = 0;
   
    @Override
    public void run() {
        for(int i =0;i<10;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("time" + i);
            time++;
        }
    }
   
}
