package lesson12сomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List <String> arrayList = new ArrayList<>();

        arrayList.add("Por");
        arrayList.add("Alex");
        arrayList.add("Xibit");

        Collections.sort(arrayList); // natural order

        System.out.println(arrayList);


        List <Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(234);
        numbers.add(0);

        Collections.sort(numbers);
        System.out.println(numbers); //default sort min > max


        /***
         * if we need sort without default sort min > max we need to use interface Comparator
         */
    }
}
