package L2Volatile;

import L1.L1Thread;

import java.util.Scanner;

public class Mainl2Volitile{
    public static void main(String[] args) {
    l2Volotile l2Volotile = new l2Volotile();
    l2Volotile.start();
    
    
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    l2Volotile.shutdown();
    }
}
