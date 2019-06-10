

import java.util.Properties
import kafka.javaapi.producer.Producer
import kafka.producer.KeyedMessage
import kafka.producer.ProducerConfig

/**
  * @Author:Alex_lei
  * @Description:
  */

object kafka_producer {
      def main(args: Array[String]) {
        val props = new Properties()
        props.put("metadata.broker.list", "192.168.254.250:9092,92.168.254.249:9092,92.168.254.248:9092")
        props.put("serializer.class", "kafka.serializer.StringEncoder")
        props.put("request.required.acks", "1")

        val config = new ProducerConfig(props)

        val producer = new Producer[String, String](config)

        val date = new KeyedMessage[String, String]("kafka-spark-test", "testInfo")

        while(true){
          producer.send(date)
        }

        producer.close
  }
}
