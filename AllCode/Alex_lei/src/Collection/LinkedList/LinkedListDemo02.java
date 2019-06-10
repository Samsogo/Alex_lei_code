package Collection.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author:Alex_lei
 * Description:create a deque and save string,operator deque.
 */
public class LinkedListDemo02 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addFirst("B");
        System.out.println(deque);
        deque.addLast("C");
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        while(deque.peekFirst()!=null){
            System.out.println(deque.peekFirst());
            deque.pollFirst();
        }
    }
}
