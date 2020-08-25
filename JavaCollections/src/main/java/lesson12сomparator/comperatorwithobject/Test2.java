package lesson12сomparator.comperatorwithobject;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Persons> persons = new ArrayList<>();
        persons.add(new Persons(17,"Bax"));
        persons.add(new Persons(23,"Ax"));
        persons.add(new Persons(34,"Xax"));

        Collections.sort(persons, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                if (o1.getAge()>o2.getAge()){
                    return 1;
                } else if (o1.getAge()<o2.getAge()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
            });

        System.out.println(persons);
    }
}
class Persons{
    public int age;
    public String name;

    public Persons(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}