package 基本类型和操作

/**
  * @Author:Alex_lei
  * @Description: 操作符和方法
  */
object Operation_function {
  def main(args: Array[String]): Unit = {
    /**
      * 任何方法都可以是运算符，例如1 + 1 ，+是运算符也是方法
      */
    val sum1 = 1+1
    val sum2 = (12).+(1)
    println(sum1)
    println(sum2)

    val str = "Hello World"
    val index1 = str indexOf('o')
    val index2 = str.indexOf('o')
    println(index1)
    println(index2)

  }
}
