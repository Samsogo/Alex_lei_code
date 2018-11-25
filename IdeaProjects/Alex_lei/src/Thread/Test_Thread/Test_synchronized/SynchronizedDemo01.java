package Thread.Test_Thread.Test_synchronized;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class SynchronizedDemo01 {
    public static void main(String[] args) {
        SynchronizedDemo01 s = new SynchronizedDemo01();
        Thread thread = new Thread(){
          public void run(){
              s.buy(getName());
          }
        };
        Thread thread1 = new Thread(){
            public void run(){
                s.buy(getName());
            }
        };
        thread.start();
        thread1.start();
    }
    public synchronized void buy(String name){
        System.out.println(name+"正在挑衣服");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name+"挑完了衣服");
        System.out.println(name+"准备试衣服");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name+"衣服试完了");
        System.out.println(name+"结账");
    }
}
