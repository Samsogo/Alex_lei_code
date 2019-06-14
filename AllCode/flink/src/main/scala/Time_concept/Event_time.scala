package Time_concept

import java.text.SimpleDateFormat

import org.apache.flink.api.scala._
import org.apache.flink.streaming.api.TimeCharacteristic
import org.apache.flink.streaming.api.functions.AssignerWithPeriodicWatermarks
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.api.scala.function.WindowFunction
import org.apache.flink.streaming.api.watermark.Watermark
import org.apache.flink.streaming.api.windowing.assigners.TumblingEventTimeWindows
import org.apache.flink.streaming.api.windowing.time.Time
import org.apache.flink.streaming.api.windowing.windows.TimeWindow
import org.apache.flink.util.Collector


/**
  * @Author:Alex_lei
  * @Description:
  */
object Event_time {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime)
    val data = env.readTextFile("file:///Users/Alex_Lei/Desktop/a.txt")

    val datastream = data.map(x=>{
      val line = x.split(" ")
      val name = line.apply(0)
      val time = line(1).toLong
      (name,time)
    })

    val watermark = datastream.assignTimestampsAndWatermarks(new MyTimestampAndWatermarks())
    watermark.print("watermark")

    val window = watermark.keyBy(_._1).window(TumblingEventTimeWindows.of(Time.seconds(3))).sum(1)

    window.print()

    env.execute()
  }

  class MyTimestampAndWatermarks extends AssignerWithPeriodicWatermarks[(String,Long)]{
    val maxOutofOrderness = 500L
    var currentMaxTimestamp:Long = _

    override def extractTimestamp(t:(String,Long), lpreviousElementTimestamp: Long): Long = {
      val timestamp = t._2
      currentMaxTimestamp = Math.max(timestamp, currentMaxTimestamp)
      timestamp
    }

    override def getCurrentWatermark(): Watermark =  {
      val watermark = new Watermark(currentMaxTimestamp-maxOutofOrderness)
      //println(watermark.getTimestamp)
      watermark
    }

  }

  class WindowFunctionTest extends WindowFunction[(String,Long),(String, Int,String,String,String,String),String,TimeWindow]{

    override def apply(key: String, window: TimeWindow, input: Iterable[(String, Long)], out: Collector[(String, Int,String,String,String,String)]): Unit = {
      val list = input.toList.sortBy(_._2)
      val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
      out.collect(key,input.size,format.format(list.head._2),format.format(list.last._2),format.format(window.getStart),format.format(window.getEnd))
    }

  }
}

