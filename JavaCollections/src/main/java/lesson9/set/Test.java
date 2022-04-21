package lesson9.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); //doesn't guarantee order
        Set<String> linkedHashSet = new LinkedHashSet<>(); //in what order were added in this order and will be displayed
        Set<String> treeSet = new TreeSet<>();//order by dictionary (natural ordering)


        hashSet.add("Pod");
        hashSet.add("Scot");
        hashSet.add("Amanda");


        linkedHashSet.add("Pod");
        linkedHashSet.add("Scot");
        linkedHashSet.add("Amanda");


        treeSet.add("Pod");
        treeSet.add("Scot");
        treeSet.add("Amanda");


        for (String name : hashSet) {
            System.out.println(name);
        }


        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        for (String name : treeSet) {
            System.out.println(name);
        }

        /**
         * Methods for Set
         */
        System.out.println("\n" + "Methods for Set - contains shows have we data or not" + "\n");

        System.out.println(hashSet.contains("Amanda") + " - Amanda");
        System.out.println(hashSet.contains("Omanda"));





    }

}
