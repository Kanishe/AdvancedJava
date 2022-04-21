package lesson1.arrylist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
//Example 0 (when we creating object Array list we need create link to List interface)
        //ArrayList<Integer> arrayList = new ArrayList(); - not correct
        //List<Integer> arrayList = new ArrayList(); - correct (now we can use methods all interface List)
        logger.warn("//Example 0");
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i <16;i++){
            arrayList.add(i);
        }
        arrayList.add(3);
        logger.info("Log4j2ExampleApp started.");
        logger.warn("Something to warn");
        logger.error("Something failed.");
        logger.debug("debug");
        logger.info(arrayList);
        logger.info(arrayList.size());
        logger.info(arrayList.get(5));
        logger.warn("//Example 1");
//Example 1
        for (int i = 0; i < arrayList.size();i++){
            logger.info(arrayList.get(i));
        }
        logger.warn("//Example 2 foreach");
//Example 2 foreach
        for (Integer x: arrayList){
            logger.info(x);
        }
//Example 3 remove
        logger.warn("//Example 3 remove");
        arrayList.remove(6);
        logger.error(arrayList + " - remove index number 6");


    }
}
