package sparkstreaming_kafka

import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka010.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe


/**
  * @Author:Alex_lei
  * @Description:
  */
object kafka_sparkstreaming_wordcount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("kafka_sparkstreaming_wordcount")
        val ssc = new StreamingContext(conf,Seconds(5))

        val kafkaParams = Map[String, Object](
          "bootstrap.servers" -> "192.168.254.250:9092,192.168.254.249:9092",
          "key.deserializer" -> classOf[StringDeserializer],
          "value.deserializer" -> classOf[StringDeserializer],
          "group.id" -> "use_a_separate_group_id_for_each_stream",
          "auto.offset.reset" -> "latest",
          "enable.auto.commit" -> (false: java.lang.Boolean)
        )
        val topics = Array("alex")

        val lines = KafkaUtils.createDirectStream[String, String](
          ssc,
          PreferConsistent,
          Subscribe[String, String](topics, kafkaParams)
        )
        val rdd = lines.map(record => (record.key, record.value))
        val rdd1 = rdd.map(x=>(x._2))
        val words = rdd1.flatMap(x=>x.split(" "))
        val word = words.map((_,1))
        val wordcount = word.reduceByKey(_+_)
        wordcount.print()
        ssc.start()
        ssc.awaitTermination()
        ssc.stop()

  }
}
