package DataStream

import java.util

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.api.scala._



/**
  * @Author:Alex_lei
  * @Description: Datastream
  */
object DataStream_test {

   case class Order(val name:String, val age:Int, val product:String,val amount:Int)

  def main(args: Array[String]): Unit = {

    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val data = util.Arrays.asList(Order("Tim",12,"apple",20),
      Order("Tim",12,"water",2),
      Order("Lily",13,"milk",5),
      Order("Bob",14,"beer",6))

    val datastream = env.fromElements(data)

    val d = datastream.map(x=>(x.get(0)))

    d.print()

    env.execute("test")
  }
}
