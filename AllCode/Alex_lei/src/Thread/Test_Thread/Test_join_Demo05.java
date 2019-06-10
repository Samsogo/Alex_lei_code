package Thread.Test_Thread;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Test_join_Demo05 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(1500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    try{
                        t1.join();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("I love you!");
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
