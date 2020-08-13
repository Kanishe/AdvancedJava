package lesson9.set;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTest {
    public static void main(String[] args) {
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> intersection2 = new HashSet<>();

        intersection.add(1);
        intersection.add(2);
        intersection.add(3);
        intersection.add(4);
        intersection.add(5);
        intersection.add(6);

        intersection2.add(6);
        intersection2.add(7);


        intersection.retainAll(intersection2);

        System.out.println(intersection);
    }
}
