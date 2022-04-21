package lesson1.arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {
    List<Integer>array = new ArrayList<>();

    array.add(3);
    array.add(2);
    array.add(1);
    array.add(4);
    array.get(3);
    System.out.println(array.get(3));
    Collections.sort(array);
    System.out.println(array);
  }
}
