package Thread.Thread_Pool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:Alex_lei
 * @Description: Thread_Pool
 */
public class ThreadPoolDemo {
    @Test
    /**
     * newCachedThreadPool()
     * 创建缓存线程池，会根据传来的任务的多少来
     * 决定线程池的线程的个数，此线程池的线程最多为max_value
     * 当任务超出了此线程数，就会处于排队情况
     */
    public void Test1(){
        ExecutorService service = Executors.newCachedThreadPool();
    }

    @Test
    /**
     * newFixedThreadPool()
     * 此方法获取一个有size个线程的线程池
     * 此线程池下最多执行size个任务
     * 其他的处于队列中
     */
    public void Test2(){
        ExecutorService service = Executors.newFixedThreadPool(10);

    }

    @Test
    /**
     *newScheduleThreadPool()
     * 此方法可以指定线程池中线程的数量
     * 可以设置延迟效果
     */
    public void Test3(){
        ExecutorService service = Executors.newScheduledThreadPool(12);
    }

    @Test
    /**
     * newSingleThreadExecutor()
     * 创建含有一个线程的线程池
     */
    public void Test4(){
        ExecutorService service = Executors.newSingleThreadExecutor();
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newScheduledThreadPool(5);
        for(int i=0;i<5;i++) {
            Runnable run = new Runnable() {
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread() + "-->" + i);
                    }
                }
            };
            service.execute(run);
        }
    }
}
