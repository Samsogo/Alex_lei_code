import java.util.{Collections, Properties}

import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}

/**
  * @Author:Alex_lei
  * @Description:
  */
object kafka_consumer {
  def main(args: Array[String]): Unit = {
    val props = new Properties()
    props.put("bootstrap.servers", "192.168.254.250:9092,192.168.254.249:9092,192.168.254.248:9092")
    props.put("metadata.broker.list", "192.168.254.250:9092,192.168.254.250:9093,192.168.254.250:9094,192.168.254.249:9094,192.168.254.249:9093,192.168.254.249:9092,192.168.254.248:9093,192.168.254.248:9092,192.168.254.248:9094")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("enable.auto.commit", "true")
    props.put("auto.commit.interval.ms", "1000")
    props.put("group.id", "test_consumer1")
    val consumer:KafkaConsumer[String,String] = new KafkaConsumer(props)
    consumer.subscribe(Collections.singletonList("kafka-spark-test-0"))
    print("-------")
    val records:ConsumerRecords[String,String] = consumer.poll(2)
    print("++++++++++")
    val t = records.iterator()
    t.forEachRemaining(a=>print(a))
  }
}
