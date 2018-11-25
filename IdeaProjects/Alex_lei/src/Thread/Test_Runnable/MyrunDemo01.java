package Thread.Test_Runnable;

/**
 * @Author:Alex_lei
 * @Description: implements Runnable and override run function
 */
public class MyrunDemo01 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Alex:"+i);
        }
    }
}
