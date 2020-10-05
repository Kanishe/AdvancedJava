package lesson7LinkedHashMapTreeMap;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); // doesn't guarantee order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//in what order were added in this order and will be displayed
        Map<Integer, String> threeMap = new TreeMap<>();// order by key, or dictionary (natural ordering)

        setMap(hashMap);
        setMap(linkedHashMap);
        setMap(threeMap);
    }
    public static void setMap (Map<Integer,String> map){
        map.put(123,"Margo");
        map.put(0,"Kanye");
        map.put(999,"Bigge");
        map.put(54,"2Pac");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    }
}
