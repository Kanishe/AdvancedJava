package lesson12сomparator.comparable2;

public class PersonForComp1 implements Comparable<PersonForComp1> {
  String name;
  int age;

  public PersonForComp1(int a, String n) {
    this.age = a;
    this.name = n;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PersonForComp1 that = (PersonForComp1) o;

    if (age != that.age) return false;
    return name != null ? name.equals(that.name) : that.name == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + age;
    return result;
  }


  @Override
  public String toString() {
    return "PersonForComp1{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }


  @Override
  public int compareTo(PersonForComp1 o) {
    if (this.age > o.getAge()) {
      return 1;
    } else if (this.age < o.getAge()) {
      return -1;
    } else
      return 0;
  }
}
