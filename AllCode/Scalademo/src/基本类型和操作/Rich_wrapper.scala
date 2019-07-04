package 基本类型和操作


import language.implicitConversions
/**
  * @Author:Alex_lei
  * @Description:
  */
object Rich_wrapper {
  def main(args: Array[String]): Unit = {
    /**
      * 目前了解就行，每个基本类型都对应一个富包装器，提供了许多的额外方法
      */

    val r = 0 max 5
    println(r)

    val s =4 to 6
    println(s)

    println(-2.7 round)
  }
}
