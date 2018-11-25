package Thread.Test_Runnable;

/**
 * @Author:Alex_lei
 * @Description: Test Runnable
 */
public class TestDemo03 {
    public static void main(String[] args) {
        /**
         * 创建Runnable子类对象
         */
        Runnable r1 = new MyrunDemo01();
        Runnable r2 = new MyrunDemo02();
        /**
         * 将Runnable子类对象传入Thread的对象中
         * Thread对象启动线程（并发）
         */
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
