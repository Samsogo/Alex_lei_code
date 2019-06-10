package Thread.Test_Thread;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        Thread thread = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("I love you!");
                }
            }
        };
        thread.start();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
    }
}
