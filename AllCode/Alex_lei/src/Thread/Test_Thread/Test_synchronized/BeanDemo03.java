package Thread.Test_Thread.Test_synchronized;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class BeanDemo03 {
    int bean = 20;
    public static void main(String[] args) {
        BeanDemo03 td = new BeanDemo03();
        Person p1 = td.new Person();
        Person p2 = td.new Person();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }
    class Person implements Runnable{
        public void run(){
            while(true){
                bean--;
                Thread current = Thread.currentThread();
                String name = current.getName();
                System.out.println(name);
                System.out.println(name+":"+bean);
                if(bean==0){
                    throw new RuntimeException();
                }
            }
        }
    }
}
