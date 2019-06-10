package sparksql

import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * @Author:Alex_lei
  * @Description: read metadata from hive and get results by execute sql
  */
object read_from_hivemeta {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("sql")
    val sc = new SparkContext(conf)
    val sqlcontext = new HiveContext(sc)
    sqlcontext.sql("use test")
    val data = sqlcontext.sql("select age,count(*) from user1 group by age")
    data.foreach(x=>print(x))
  }
}
