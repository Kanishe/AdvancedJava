package lesson2.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {
    List<String> linkedList = new LinkedList<>();
    List<String> arrayList = new ArrayList<>();

    linkedList.add("a");
    linkedList.add("b");
    linkedList.add("c");
    linkedList.add("b");

    arrayList.add("a");
    arrayList.add("b");
    arrayList.add("c");
    arrayList.add("b");

    System.out.println(linkedList);
    System.out.println(arrayList);
  }
}
