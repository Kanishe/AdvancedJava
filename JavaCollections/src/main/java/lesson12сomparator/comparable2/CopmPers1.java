package lesson12сomparator.comparable2;

import java.util.*;

public class CopmPers1 {
  public static void main(String[] args) {
    List<PersonForComp1> arrayListPersonForComp1 = new ArrayList<>();
    Set<PersonForComp1> treeSetPersonForComp1 = new  TreeSet<>();

    addElements(arrayListPersonForComp1);
    addElements(treeSetPersonForComp1);



    System.out.println(arrayListPersonForComp1);
  }

  private static void addElements(Collection collection){
    collection.add(new PersonForComp1(1,"A"));
    collection.add(new PersonForComp1(5,"N"));
    collection.add(new PersonForComp1(3,"C"));

  }
}
