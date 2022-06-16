package L2Volatile;

import L1.L1Thread;

import java.util.Scanner;

public class Mainl2Volitile{
    public static void main(String[] args) {
        Volitileessss.printSmth();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        new Volitileessss().stop();

    }
}

class Volitileessss{
    private static volatile int counter;
    public static volatile boolean a = true;

    public static void printSmth(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (a){
                    counter++;
                    System.out.println("AA - hhhhhh" + counter);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.start();
    }


    public void stop(){
        this.a = false;
    }


}



