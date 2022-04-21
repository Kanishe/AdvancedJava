package lesson3.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
  public static void main(String[] args) {
    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    Map<Integer, String> treeMap = new TreeMap<>();

    addInMap(hashMap);
    addInMap(linkedHashMap);
    addInMap(treeMap);

  }

  public static void addInMap(Map<Integer, String> map) {
    map.put(1, "A");
    map.put(5, "Bjjj");
    map.put(3, "C");
    map.put(4, "D");
    map.put(5, "Emmmm");

    for (Map.Entry<Integer,String> entry:map.entrySet()){
      System.out.println(entry.getKey()+":"+entry.getValue());
    }
  }

}
