package lesson13interfacecomparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }
    public static void addElements(Collection collection){
        collection.add(new Person(1123,"Pablo"));
        collection.add(new Person(12,"Kody"));
        collection.add(new Person(92,"Fred"));
        collection.add(new Person(1000,"Dracula"));
    }
}
class Person implements Comparable <Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId()){
            return 1;
        }
        else if(this.id<o.getId()){
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

