package Thread.Produce_consume;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Consumer extends Thread {
    private int num;
    private Storage storage;

    public Consumer(Storage storage){
        this.storage = storage;
    }

    public void run(){
        consume(num);
    }

    public void consume(int a){
        storage.consume(a);
    }

    public void setNum(int num){
        this.num = num;
    }
}
