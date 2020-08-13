package lesson9.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Union
 */

public class UnionTest {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);


        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println(unionSet);
    }
}
