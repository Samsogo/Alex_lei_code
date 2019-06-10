package Collection.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:Alex_lei
 * Description:create a set and save three String.
 */
public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        /*
         * Set在存入元素时，是无序的，与放入顺序无关。
         * 当Set集合中的元素不变，不管取多少次，取出来的
         * 顺序是一致的。
         *
         * 为什么会有哈希算法。
         * 当集合中有成千上万个元素，我们在检索这个集合中
         * 是否有某一个元素时，要取集合中的每一个元素进行equals比较
         * 当找到了，停止比较。怎么确定集合中没有这个元素。要比较所有的
         * 元素之后才能确定。这样，效率是非常低的。
         * 为了解决效率低的问题。设计了散列算法，即为每一个对象分配一个
         * 值。在集合中，设计多个区域，每个区域存储一部分
         * 的哈希值的对象。在添加元素时，根据元素的值，就可以确定
         * 所在区域。然后看这个值是否存有对象，没有对象，就可以存此元素。
         * 当已经存有对象时，我们要比较equals方法，如果不一样，我们就可以继续
         * 存元素，存在此值对应的链表中。一样的话，说明不能再添加进来了。
         *
         * 在查询效率上是很低的。因此我们要尽量避免出现链表这种情况。
         *
         * 在自定义类时，要重写hashCode方法和equals方法
         *
         * 总结：
         * 往Set集合中存元素时，
         * 1：先计算哈希值，
         *   哈希值不一样，就能添加。
         *   哈希值一样时，要转入2
         * 2：比较equals方法(equals是非常重要的)
         *    返回false,----能存----存到链表
         *    返回true.----不能存
         */
    }
}
