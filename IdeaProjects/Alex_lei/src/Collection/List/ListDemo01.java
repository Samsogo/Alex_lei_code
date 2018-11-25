package Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Alex_lei
 * description:List,ArrayList,subList,The parentList will change when we modify the sublist.
 */

public class ListDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //随机产生8个10以内的数字存到一个集合中
        for(int i=0;i<8;i++){
            int k = (int)(Math.random()*10);
            list.add(k);
        }
        System.out.println("产生的8个随机数："+list);
        //截取第2-5个元素
        List<Integer> list1 = list.subList(1,5);
        System.out.println("子集："+list1);
        for(int i=0;i<list1.size();i++){
            int ans = list1.get(i);
            list1.set(i,ans*10);
        }
        System.out.println("每个元素*10："+list1);
        System.out.println("父集："+list);
    }
}
