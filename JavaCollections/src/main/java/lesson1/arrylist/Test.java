package lesson1.arrylist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Test {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
        for ( int i = 0; i <100000;i++){
            arrayList.add(i);
        }
        logger.info("d" + "d");
        logger.info("dsa");
        logger.warn("sds");
        logger.debug("da");
    }
}
