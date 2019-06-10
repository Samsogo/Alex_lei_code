package Collection.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:Alex_lei
 * create a Queue and save 5 integer and operator queue.
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<5;i++){
            int k = (int)(Math.random()*10);
            queue.offer(k);
        }
        System.out.println("Total elements:"+queue);
        System.out.println("队首元素:"+queue.peek());
        while(queue.peek()!=null){
            System.out.println("队首元素:"+queue.peek());
            queue.poll();
        }
    }
}
