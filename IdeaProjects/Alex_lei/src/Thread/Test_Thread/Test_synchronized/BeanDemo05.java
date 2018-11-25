package Thread.Test_Thread.Test_synchronized;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class BeanDemo05 {
    static BeanDemo05 bd = new BeanDemo05();
    static int bean = 20;
    public synchronized int getBean(){
        if(bean==0){
            throw new RuntimeException("Don't have bean...");
        }
        try{
            bean--;
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return bean;
    }
    public static void main(String[] args){
        Thread thread = new Thread(){
          public void run(){
              while(true){
                  int b = bd.getBean();
                  System.out.println(Thread.currentThread()+":"+b);
              }
          }
        };
        Thread thread1 = new Thread(){
          public void run(){
              while(true){
                  int a = bd.getBean();
                  System.out.println(Thread.currentThread()+":"+a);
              }
          }
        };
        thread.start();
        thread1.start();
    }
}
