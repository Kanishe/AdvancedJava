package lesson3.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();

        map.put(1,"P");
        map.put(2,"E");
        map.put(3,"T");
        map.put(4,"O");
        map.put(5,"N");

        System.out.print(map);


        System.out.println(map.get(1));

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "" + entry.getValue() );
        }
    }
}
