package 使用列表

/**
  * @Author:Alex_lei
  * @Description:
  */
object List_object_method {
  def main(args: Array[String]): Unit = {
    /**
      * 通过元素创建列表
      */

    val l = List.apply(1,2,3)
    println(l)

    /**
      * 创建数值范围的列表
      */

    val rl = List.range(1,5)
    val rl1 = List.range(1,9,2)
    val rl2 = List.range(9,1,-3)
    println(rl)
    println(rl1)
    println(rl2)

    /**
      * 列表的连接
      */
    val ll =  List.concat(List(1,2,3),List(2,3,4))
    println(ll)


  }
}
