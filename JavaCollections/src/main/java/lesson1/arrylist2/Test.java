package lesson1.arrylist2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<10; i++){
         list.add(i);
            logger.info(list);
        }
    }
}
