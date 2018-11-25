package Thread.Test_Thread.Test_synchronized;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class BeanDemo04 {
    static int bean = 20;
    static Object obj = new Object();
    public static int getBean(){
        synchronized (obj){
            if(bean==0){
                throw new RuntimeException();
            }
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            bean--;
        }
        return bean;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(){
          public void run(){
              while(true){
                  int b = getBean();
                  System.out.println(Thread.currentThread()+":"+b);
              }
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    int a = getBean();
                    System.out.println(Thread.currentThread()+":"+a);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
