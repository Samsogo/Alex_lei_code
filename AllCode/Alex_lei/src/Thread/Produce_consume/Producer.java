package Thread.Produce_consume;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Producer extends Thread{
    private int num;
    private Storage storage;

    public Producer(Storage storage){
        this.storage = storage;
    }

    public void run(){
        produce(num);
    }

    public void produce(int num){
        storage.produce(num);
    }

    public void setNum(int num){
        this.num = num;
    }
}
