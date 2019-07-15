package 特质

import scala.collection.mutable.ListBuffer

/**
  * @Author:Alex_lei
  * @Description:  使用特质作可堆叠的改变，这里是对队列中的数据进行加倍
  */
object Trait_change {
  def main(args: Array[String]): Unit = {
    /**
      * 不实用特质的
      */
    val queue = new BasicIntQueue
    queue.put(1)
    queue.put(2)
    queue.put(3)
    println(queue.get())
    println(queue.get())

    println("---------")

    /**
      * 进入队列的元素翻倍
      */
    val myqueue = new Myqueue
    myqueue.put(3)
    myqueue.put(2)
    println(myqueue.get())

    println("----------")

    /**
      *   在new实例化的时候混入特质，将大于0的元素加1，小于0的不会放入队列
      */
    val q = new BasicIntQueue with Increment with Filter
    q.put(1)
    q.put(-2)
    q.put(2)
    println(q.get())
    println(q.get())

  }
}

class BasicIntQueue extends IntQueue{
  val buf = new ListBuffer[Int]
  override def get(): Int = buf.remove(0)

  override def put(x: Int): Unit = buf += x
}

class Myqueue extends BasicIntQueue with Doubling

abstract class IntQueue{
  def put(x:Int)
  def get():Int
}

trait Doubling extends IntQueue{
  abstract override def put(x: Int){super.put(2 * x)}
}

trait Increment extends IntQueue{
  abstract override def put(x: Int): Unit = super.put(x+1)
}

trait Filter extends IntQueue{
  abstract override def put(x: Int): Unit = if(x>0) super.put(x)
}