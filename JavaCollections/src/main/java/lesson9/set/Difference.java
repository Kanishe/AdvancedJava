package lesson9.set;

import java.util.HashSet;
import java.util.Set;

public class Difference {
    public static void main(String[] args) {
        Set<Integer> differ = new HashSet<>();
        Set<Integer> differ2 = new HashSet<>();

        differ.add(0);
        differ.add(1);
        differ.add(2);
        differ.add(3);

        differ2.add(1);
        differ2.add(2);
        differ2.add(3);
        differ2.add(4);


       // differ.removeAll(differ2);


        System.out.println(differ);

    }
}
