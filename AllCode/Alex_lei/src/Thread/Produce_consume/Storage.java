package Thread.Produce_consume;


import java.util.LinkedList;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class Storage {
    private LinkedList<Object> linkedList = null;
    private int MAX_SIZE;

    public Storage(){
        linkedList = new LinkedList();
        MAX_SIZE = 100;
    }

    public void produce(int num){
        synchronized (linkedList){
            while(num+linkedList.size()>MAX_SIZE){
                System.out.println("要生产的数量:"+num+"加上库存:"+linkedList.size()+"大于最大储存量");
                try{
                    linkedList.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            for(int i=1;i<=num;i++){
                linkedList.add(new Object());
            }
            System.out.println("已经生产:"+num+"现在的存储为:"+linkedList.size());
            linkedList.notifyAll();
        }
    }

    public  void consume(int num){
        synchronized (linkedList){
            while(num>linkedList.size()){
                System.out.println("现在的储存:"+linkedList.size()+"不够消费："+num);
                try{
                    linkedList.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            for(int i=1;i<=num;i++){
                linkedList.remove();
            }
            System.out.println("已经消费:"+num+"现在的存储为："+linkedList.size());
            linkedList.notifyAll();
        }
    }
}
