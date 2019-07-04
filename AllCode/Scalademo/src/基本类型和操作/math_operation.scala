package 基本类型和操作

/**
  * @Author:Alex_lei
  * @Description:
  */
object math_operation {
  def main(args: Array[String]): Unit = {
    /**
      * +,-,*,/,%等。
      */

    println(1+1)
    println(1-2)
    println(1*2)
    println(1/2)
    println(1%2)

    //可以表示正负，也可以调用unary_+或者unary_-
    val t = +3
    val r = -2
    val s = 3.unary_-
    println(t)
    println(r)
    println(s)
  }
}
