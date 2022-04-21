package lesson10hashcodeandequals.Test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class equalsAndHashCode {
  public static void main(String[] args) {
    Map<Person,String> map = new HashMap<>();
    Set<Person> set = new HashSet<>();

    Person person1 = new Person(11,"Petr");
    Person person2 = new Person(11,"Petr");

    map.put(person1,"1");
    map.put(person2,"1");

    set.add(person1);
    set.add(person2);

    System.out.println(map);
    System.out.println(set);
  }
  }

class Person{
  private int age;
  private String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (age != person.age) return false;
    return name.equals(person.name);
  }

  @Override
  public int hashCode() {
    int result = age;
    result = 31 * result + name.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }

  public Person (int a, String n){
    this.age = a;
    this.name = n;
  }
}
