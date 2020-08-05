package lesson2.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        List <Integer> linkedList = new LinkedList<>();
        //head -> [1] -> [2]
        List <Integer> arrayList = new ArrayList<>();
        //[1][2]
        measureTime(linkedList);
        measureTime(arrayList);
    }
/**
 * arrayList faster linkedList if you need to:
 * 1.add elements in massive (IF you add elements in to the end of the array),
 * !if you add elements in to the begin massive it be slower then linkedList!
 * 2.get elements from massive
*/
    public static void measureTime(List<Integer> list) {
//        for (int i = 0; i<100000;i++){
//            list.get(i);
//        }
        long start = System.currentTimeMillis();

        for (int i = 0; i<100000;i++){
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        logger.info(end - start);
    }
}
