package DataStream.kinds_of_data_source

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.api.scala._

/**
  * @Author:Alex_lei
  * @Description: data source from socket
  */
object DataStream_test_read_from_socket {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    /**
      * 获取数据源的方式还有很多，还包括
      * readFile(fileInputFormat, path)
      * readFile(fileInputFormat, path, watchType, interval, pathFilter, typeInfo)
      * fromCollection(Collection)   可以测试用
      * fromCollection(Iterator, Class)
      * fromElements(T ...)
      * fromParallelCollection(SplittableIterator, Class)
      * generateSequence(from, to)
      * addSource(new FlinkKafkaConsumer08<>(...))   生产环境用
      */
    val datastream = env.socketTextStream("localhost",9000)

    val result = datastream.flatMap(line=>line.split(" "))
                               .map(x=>(x,1))
                                 .keyBy(0).sum(1)

    result.print()

    env.execute("read from socket")

  }
}
