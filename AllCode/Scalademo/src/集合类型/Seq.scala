package 集合类型

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * @Author:Alex_lei
  * @Description:
  */
object Seq {
  def main(args: Array[String]): Unit = {
    /**
      * 列表,之前也对列表进行了细致分享，这里就简单说下了
      */

    val l = List[String]("alex","Lily","Bob")
    println(l.head)
    println(l.length)

    /**
      * 数组，一个可以保留一组元素序列并可以基于零的索引高效访问处于任意位置的元素
      */
    val arr = new Array[Int](5)
    arr.foreach(println(_))
    val a = Array(1,2,3)
    a.foreach(x=>println(x))

    /**
      * 列表缓存，高效的通过添加元素的方式构建列表
      * 元素的添加使用+=操作符，前缀使用+:操作符
      * 使用ListBuffer可以避免栈溢出
      */
    val listbuffer = new ListBuffer[Int]
    listbuffer += 1
    listbuffer += 2
    val ll = listbuffer.toList
    println(ll)

    val lll = 3 +: listbuffer
    println(lll)

    /**
      * 数组缓存,与数组类似，但是允许你在序列的开始或结束的地方添加和删除元素
      */

    val buf = new ArrayBuffer[Int]
    buf += 12
    buf += 13
    buf.foreach(println(_))

    /**
      * 队列,先进先出
      * 该队列是可变队列
      */

    val q = new mutable.Queue[Int]
    val has1 = q.enqueue(1)
    val has2 = q.enqueue(2)
    val has3 = q.enqueue(3)
    val has4 = q.enqueue(4)
    println(q.dequeue) //移除头部元素，并显示头部元素
    println(q.head) // 打印头部元素
    println(q.tail)//去除头部元素后的剩余元素

    /**
      * 栈，先进后出
      * 该栈是可变的
      */

    val s = new mutable.Stack[Int]
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.push(5)
    println(s.top)
    s.pop()
    println(s.top)

    /**
      * 这里使用了隐士转换，因为字符串是没有exist函数的
      * 它是经RichString隐士转换，RichString也是一个序列
      */
    val b = hasUpperCase("I am alex")
    println(b)
  }

  def hasUpperCase(s:String):Boolean = s.exists(_.isUpper)
}
