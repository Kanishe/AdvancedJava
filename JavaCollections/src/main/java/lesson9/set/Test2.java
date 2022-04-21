package lesson9.set;

import java.util.*;

public class Test2 {
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    Set<String> linkedHashSet = new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();

    treeSet.add("PPPP");
    treeSet.add("AAAAA");
    treeSet.add("VVVVV");
    treeSet.add("CCCCC");
    treeSet.add("DDDDD");
    treeSet.add("VVVVV");

    for (String name : treeSet) {
      System.out.println(name);
    }
  }

}
