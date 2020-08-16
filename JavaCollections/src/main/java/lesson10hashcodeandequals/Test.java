package lesson10hashcodeandequals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1,"Mike");
        Person person2 = new Person(1,"Mike");
//        Person person2 = new Person(2,"Tom");

        map.put(person1,"per1");
        map.put(person2,"per2");

        set.add(person1);
        set.add(person2);


        System.out.println(map);
        System.out.println(set);
    }
}
