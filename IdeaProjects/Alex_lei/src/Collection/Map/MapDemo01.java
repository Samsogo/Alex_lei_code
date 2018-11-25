package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author:Alex_lei
 * Description:create a map and operate it.
 */
public class MapDemo01 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("A","apple");
        map.put("B","banana");
        map.put("C","computer");

        //display the map
        System.out.println(map);

        //get value of A
        String key = map.get("A");
        System.out.println("A="+key);

        //check the map whether contain key D or value apple
        boolean flag_1 = map.containsKey("D");
        boolean flag_2 = map.containsValue("apple");
        System.out.println(flag_1+"\t"+flag_2);

        //get a set of all key of map
        Set<String> set = map.keySet();
        //Iterator traversal the set
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterator:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------");

        //foreach traversal the set and get value of map
        System.out.println("Foreach:");
        for(String s:set){
            String value = map.get(s);
            System.out.println(value);
        }
        System.out.println("-------------------------------");

        //entrySet is a set of key-value
        Set<Map.Entry<String,String>> s = map.entrySet();
        System.out.println("EntrySet:");
        for(Map.Entry<String,String> t:s){
            System.out.println(t.getKey());
            System.out.println(t.getValue());
        }
    }
}
