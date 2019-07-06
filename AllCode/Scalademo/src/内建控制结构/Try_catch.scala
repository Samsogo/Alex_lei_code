package 内建控制结构

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * @Author:Alex_lei
  * @Description:
  */
object Try_catch {
  def main(args: Array[String]): Unit = {
    /**
      * Scala的处理异常和Java用法一样
      */

    try {
      val f = new FileReader("try.txt")
    }catch {
      case ex: FileNotFoundException => println("文件不存在")
      case ex: IOException => println("IO异常")
    }finally {
      println("异常处理完成")
    }
  }
}
