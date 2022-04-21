package lesson14queue.T2;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
  public static void main(String[] args) {
    PersonForQueue1 person1=new PersonForQueue1(1);
    PersonForQueue1 person2=new PersonForQueue1(2);
    PersonForQueue1 person3=new PersonForQueue1(3);
    PersonForQueue1 person4=new PersonForQueue1(4);

    Queue<PersonForQueue1> people=new LinkedList<>();

    people.add(person3);
    people.add(person4);
    people.add(person2);
    people.add(person1);

    for (PersonForQueue1 person:people){
      System.out.println(person);
    }

  }
}
