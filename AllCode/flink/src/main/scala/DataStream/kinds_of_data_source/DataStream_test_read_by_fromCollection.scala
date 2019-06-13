package DataStream.kinds_of_data_source

import java.util

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.api.scala._
import scala.collection.JavaConverters._  //Java集合与Scala集合互转


/**
  * @Author:Alex_lei
  * @Description: data source from collection,but should have the same type in list,in this we use List<T>,T is Order
  */
object DataStream_test_read_by_fromCollection {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val list = new util.ArrayList[Order]()
    list.add(new Order("Tim","apple",10))
    list.add(new Order("Bob","water",2))
    list.add(new Order("Lily","bear",100))
    list.add(new Order("Lily","cola",3))

    val datastream = env.fromCollection(list.asScala)

    datastream.print()

    env.execute("data source from collection")
  }

  class Order(user:String, product:String, amount:Int){


    def getUser(): String = {
      this.user
    }

    def getProduct(): String = {
      this.product
    }

    def getAmount(): Int = {
      this.amount
    }


    override def toString: String = "Order:{"+"user:"+this.user+",product:"+this.product+",amount:"+this.amount+"}"
  }
}

