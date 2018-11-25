package Thread.Anonymous_inner_class;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("Alex:"+i);
                }
            }
        };

        Thread thread = new Thread(){
          public void run(){
              for(int i=0;i<100;i++) {
                  System.out.println("Alex_lei:" + i);
              }
          }
        };
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
