package lesson14queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class View {
    public static void main(String[] args) {
        Person person1 = new Person("Goll",1);
        Person person2 = new Person("Zklaaa",2);
        Person person3 = new Person("Viena",3);
        Person person4 = new Person("Nell",4);
        Person person5 = new Person("Mopaaaer",5);
        Person person6 = new Person("AED",6);

        Queue<Person> peopleLinkedList = new LinkedList<>();
        //add person in LinkedList
        peopleLinkedList.add(person5);
        peopleLinkedList.add(person6);
        peopleLinkedList.add(person3);
        peopleLinkedList.add(person4);
        peopleLinkedList.add(person1);
        peopleLinkedList.add(person2);

        for (Person person : peopleLinkedList){

            System.out.println(person);
        }
    }
}
