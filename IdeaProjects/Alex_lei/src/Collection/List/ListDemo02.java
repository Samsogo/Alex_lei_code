package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author:Alex_lei
 * description:create a list not only save five integer that less than 10 but also sort them
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            int k = (int)(Math.random()*10);
            list.add(k);
        }
        System.out.println("Before sort:"+list);
        Collections.sort(list);
        System.out.println("After sort:"+list);
    }
}
