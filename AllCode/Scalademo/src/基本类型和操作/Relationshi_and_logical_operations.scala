package 基本类型和操作

/**
  * @Author:Alex_lei
  * @Description:
  */
object Relationshi_and_logical_operations {
  def main(args: Array[String]): Unit = {
    /**
      * 关系方法：>,<,>=,<=
      */
    val t = 1>2
    println(!t)


    val r = 2 >= 1
    println(r)

    /**
      * 逻辑方法 &&，||
      */

    val flag1 = true
    val flag2 = false

    val res1 = flag1 && flag2
    println(res1)

    val res2 = flag1 || flag2
    println(res2)

    /**
      * 位操作符
      */

    val a1 = 1 & 2  //与运算
    println(a1)

    val a2 = 1 | 2 //或运算
    println(a2)

    val a3 = 1 ^ 3 //异或运算
    println(a3)

    val a4 = ~1 //取补运算
    println(a4)
  }
}
