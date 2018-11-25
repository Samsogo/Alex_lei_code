package Thread.Test_Thread;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Test_yield_Demo04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    Thread.yield();
                    System.out.println(i);
                    try{

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
