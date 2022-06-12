package L4SynchronizedPart2.draft1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Draft1 {
    public static void main(String[] args) {
        
        
        long before = System.currentTimeMillis();
        new Box().main2();
        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + "ms to run");
        
        long before2 = System.currentTimeMillis();
        new Box().doWork();
        long after2 = System.currentTimeMillis();
        System.out.println("Program took " + (after2 - before2) + "ms to run");
        
    }
}

class Box {
    Object lock1 = new Object();
    Object lock2 = new Object();
    private List<Integer> itemBox1 = new ArrayList<>();
    private List<Integer> itemBox2 = new ArrayList<>();
    Random random = new Random();
    
    public void addItemToTheBox1() {
        synchronized (lock1) {
            try {
                Thread.sleep(0);
                itemBox1.add(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public void addItemToTheBox2() {
        synchronized (lock2) {
            try {
                Thread.sleep(0);
                itemBox2.add(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public void main() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                addItemToTheBox1();
                addItemToTheBox2();
            }
        });
        thread1.start();
        
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                addItemToTheBox1();
                addItemToTheBox2();
            }
        });
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void main2() {
        
        for (int i = 0; i < 8000; i++) {
            addItemToTheBox1();
            addItemToTheBox2();
        }
        System.out.println("Elemets in the box 1 - " + itemBox1.size());
        System.out.println("Elemets in the box 2 - " + itemBox2.size());
        
    }
    
    public void doWork() {
        for (int i = 0; i < 4000; i++) {
            main();
        }
        System.out.println("Elemets in the box 1 - " + itemBox1.size());
        System.out.println("Elemets in the box 2 - " + itemBox2.size());
        
        
    }
    
}