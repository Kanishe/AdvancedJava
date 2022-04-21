package lesson1.arrylist;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < 10; i++){
      arrayList.add(i);
    }

    for (int i = 0; i < arrayList.size(); i++) {
      System.out.print(arrayList.get(i));
    }
    arrayList.add(5,9);
    arrayList.add(5,null);
    System.out.println(arrayList + "\n");
  }
}
