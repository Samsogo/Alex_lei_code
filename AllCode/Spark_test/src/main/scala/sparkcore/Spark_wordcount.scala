package sparkcore

import org.apache.spark.{SparkConf, SparkContext}

/**
  * @Author:Alex_lei
  * @Description: wordcount
  */
object Spark_wordcount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("wordcount").setMaster("local[3]")
    val sc = new SparkContext(conf)

    val text = sc.textFile("file:///Users/Alex_Lei/Desktop/a.txt")
    val rdd = text.flatMap(x=>x.split(" "))
    val rdd1 = rdd.map(x=>(x,1))
    val rdd2 = rdd1.reduceByKey(_+_)
    rdd2.foreach(x=>print(x))
    print(rdd2.toDebugString)

    val rdd3 = rdd2.sortByKey(false)
    rdd3.foreach(print)
    Thread.sleep(1000000)
  }
}
