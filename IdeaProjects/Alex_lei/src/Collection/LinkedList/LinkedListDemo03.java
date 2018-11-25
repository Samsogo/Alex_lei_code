package Collection.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author:Alex_lei
 * Description:create a stack and operate it.
 */
public class LinkedListDemo03 {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        //查看栈顶元素
        System.out.println(stack.peekFirst());
        //查看最底下的元素
        System.out.println(stack.peekLast());
        //遍历栈
        while(stack.peekFirst()!=null){
            System.out.println(stack.peek());
            stack.poll();
        }
    }
}
