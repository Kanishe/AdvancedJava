package lesson2.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class readInArrayAndlinkedList {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();
    measure(arrayList);
    measure(linkedList);
  }

  public static void measure(List<Integer> list) {
    for (int a = 0; a < 100000; a++) {
      list.add(a);
    }
    long start = System.currentTimeMillis();
    for (int i = 0; i < list.size(); i++) {
      list.get(i);
    }
    long finish = System.currentTimeMillis();

    System.out.println(finish - start);
  }
}
