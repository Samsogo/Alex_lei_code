package Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo03 {
    public static void main(String[] args) {
        //TreeSet是Set接口的有序的二叉树集合实现类
        Set<Integer> set = new TreeSet<>();
        Set<String> s = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        s.add("A");
        s.add(null);
        s.add(null);
        System.out.println(s.size());//2

        System.out.println(set);//[1,2,3]
    }
}
