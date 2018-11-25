package Thread.Test_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:Alex_lei
 * @Description: 每隔一秒输出一次时间
 */
public class TestDemo02 {
    public static void main(String[] args) {
        Thread thread =new Thread(){
            public void run(){
                while(true){
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    String time = sdf.format(date);
                    System.out.println(time);
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}
