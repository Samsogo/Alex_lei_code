package DataStream.kinds_of_data_source

import java.util.Properties

import org.apache.flink.api.common.serialization.SimpleStringSchema
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.connectors.kafka.{FlinkKafkaConsumer010, FlinkKafkaConsumer09}
import org.apache.flink.api.scala._

/**
  * @Author:Alex_lei
  * @Description: data source from kafka
  */
object DataStream_test_from_external_system {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val properties = new Properties()
    properties.setProperty("bootstrap.servers","39.105.177.196:9092")
    properties.setProperty("zookeeper.connect","39.105.177.196:2181")
    properties.setProperty("group.id","flink_connect_kafka")
    val source = new FlinkKafkaConsumer010("test",new SimpleStringSchema(),properties)

    source.setStartFromEarliest()

    val datastream = env.addSource(source)

    datastream.print()

    env.execute()
  }
}
