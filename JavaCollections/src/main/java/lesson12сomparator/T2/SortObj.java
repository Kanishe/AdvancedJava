package lesson12сomparator.T2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObj {
  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("B", 2));
    people.add(new Person("C", 3));
    people.add(new Person("A", 1));

    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        if (o1.getAge() < o2.getAge()) {
          return -1;
        } else if (o1.getAge() > o2.getAge()) {
          return 1;
        } else
          return 0;
      }
    });
    System.out.println(people);
  }

}

class Person {
  String name;
  int age;

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  public Person(String name, int a) {
    this.name = name;
    this.age = a;
  }

}
