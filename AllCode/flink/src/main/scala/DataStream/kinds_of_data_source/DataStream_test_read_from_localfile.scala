package DataStream.kinds_of_data_source

import org.apache.flink.api.common.accumulators.IntCounter
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.api.scala._



/**
  * @Author:Alex_lei
  * @Description: Datastream_demo，data source from localfile
  */
object DataStream_test_read_from_localfile {

  def main(args: Array[String]): Unit = {
    /**
      * 获取本地运行环境，本地测试通常使用getExecutionEnvironment
      * 还可以通过StreamExecutionEnvironment.createLocalEnvironment()
      * StreamExecutionEnvironment.createRemoteEnvironment(host: String, port: Int, jarFiles: String*)
      */
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    /**
      * 在此举例说明读取外部文件作为数据源，后续还会说明通过不同的方式获取数据源
      */
    val data = env.readTextFile("file:///Users/Alex_Lei/Desktop/a.txt")

    /**
      * 对数据源进行相关的操作，类似于Spark的RDD算子操作，后续也会举例说明
      */
    data.print("datastream")

    /**
      * 最后必须加这一行代码，才会触发执行程序。
      * 因为flink的程序都是懒加载模式，即上述所写的读取外部文件和对数据流的一系列操作只有调用execute方法才会执行
      */

    val numlines = new IntCounter()
    env.execute("test")
  }
}
