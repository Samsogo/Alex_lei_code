package sparkstreaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}


/**
  * @Author:Alex_lei
  * @Description:
  */
object Sparkstreaming_wordcount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[4]").setAppName("SparkStreamingWordCount")
    val ssc = new StreamingContext(conf,Seconds(5))
    //val lines = ssc.socketTextStream("localhost",9999) 从端口取数据
    val lines = ssc.textFileStream("hdfs://master1:9000/test")
    val words = lines.flatMap(_.split(" "))
    val word = words.map((_,1))
    val wordcount = word.reduceByKey(_+_)
    wordcount.print()
    ssc.start()
    ssc.awaitTermination()
    ssc.stop()
  }
}
