package 控制抽象

/**
  * @Author:Alex_lei
  * @Description: 柯里化函数
  */
object Currie_function {
  def main(args: Array[String]): Unit = {
    val r1 = cal(1,2)
    println(r1)

    /**
      * 其实当调用currie_cal函数时，实际上接连调用了两个传统函数
      * ，第一个调用的是单个a参数的，第二个是调用的是单个b参数的。
      * 实现的就是下面的first和second函数
      */
    val r2 = currie_cal(1)(2)
    println(r2)

    val second = first(1)
    val r4 = second(2)
    println(r4)

  }

  /**
    * 传统的两个数相加
    * @param a
    * @param b
    * @return
    */
  def cal(a:Int,b:Int):Int = {
    a + b
  }

  /**
    * 柯里化的函数
    * @param a
    * @param b
    * @return
    */
  def currie_cal(a:Int)(b:Int) = a + b

  def first(a:Int) = (b:Int) => a + b
}
