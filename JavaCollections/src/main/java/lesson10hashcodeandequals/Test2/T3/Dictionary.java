package lesson10hashcodeandequals.Test2.T3;

import java.util.HashSet;
import java.util.Set;

public class Dictionary {
  public static void main(String[] args) {
    Set<Person>set = new HashSet<>();

    Person person1 = new Person("A",1);
    Person person2 = new Person("A",1);

    set.add(person1);
    set.add(person2);
    System.out.println(set);
  }
}
class Person{
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
    int result = name.hashCode();
    result = 31 * result + age;
    return result;
  }

  String name;
  int age;

  public Person(String n,int a){
    this.name = n;
    this.age = a;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
