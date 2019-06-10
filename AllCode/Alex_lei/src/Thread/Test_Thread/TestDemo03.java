package Thread.Test_Thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @Author:Alex_lei
 * @Description: Thread's priority
 */
public class TestDemo03 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                System.out.println("1");
            }
        };
        Thread thread1 = new Thread(){
            public void run(){
                System.out.println(2);
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                System.out.println(3);
            }
        };
        System.out.println(thread.getPriority());
        thread.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
