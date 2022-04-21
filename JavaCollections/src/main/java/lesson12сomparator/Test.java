package lesson12сomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();

    arrayList.add("Porghhhh");
    arrayList.add("Alex");
    arrayList.add("Xibit");

    //Collections.sort(arrayList); // natural order
    Collections.sort(arrayList, new StringLengthComparator());// with modify compare method

    System.out.println(arrayList);


    List<Integer> numbers = new ArrayList<>();
    numbers.add(4);
    numbers.add(5);
    numbers.add(234);
    numbers.add(0);

/**
 * also we can created modify compare method without class
 */


        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return - 1;
                } else if (o1 < o2) {
                    return 1;
                } else
                    return 0;
            }
        });
    System.out.println(numbers); //default sort min > max


    /**
     * if we need sort without default sort min > max we need to use interface Comparator
     */
  }
}

/***
 * Convention compare method
 * o1 > o2 = 1
 * o1 < o2 = -1
 * o1 == o2 = 0
 */
class StringLengthComparator implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    if (o1.length() > o2.length()) {
      return 1;
    } else if (o1.length() < o2.length()) {
      return -1;
    } else {
      return 0;
    }
  }
}