package lesson2.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class addToTheTopOfThelistInArrayAndlinkedList {
  public static void main(String[] args) {
    List<Integer>arrayList = new ArrayList<>();
    List<Integer>linkedList = new LinkedList<>();
    measure(arrayList);
    measure(linkedList);
  }
  public static void measure (List<Integer> list){
    long start = System.nanoTime();
    for(int i = 0; i<100000;i++){
      list.add(0,i);
    }
    long finish = System.nanoTime();

    System.out.println(finish - start);
  }
}
