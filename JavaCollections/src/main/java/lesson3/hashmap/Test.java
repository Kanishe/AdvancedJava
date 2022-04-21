package lesson3.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();

        map.put(5,"five");
        map.put(4,"four");
        map.put(3,"three");
        map.put(2,"two");
        map.put(1,"One");
        map.put(0,"ziro");

        System.out.print(map);

        System.out.println( map.get(1));

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue() );
        }
    }
}
