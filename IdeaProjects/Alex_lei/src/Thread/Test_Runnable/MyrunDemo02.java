package Thread.Test_Runnable;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class MyrunDemo02 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Alex_lei:"+i);
        }
    }
}
