package Thread.Thread_Pool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list = Collections.synchronizedList(list);
        //Collections.synchronizedMap(map);
        //Collections.synchronizedSet(set);
        System.out.println(list);
    }
}
