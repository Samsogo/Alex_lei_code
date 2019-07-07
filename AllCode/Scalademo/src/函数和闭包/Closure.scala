package 函数和闭包

/**
  * @Author:Alex_lei
  * @Description: 闭包
  */
object Closure {
  var more = 1
  def main(args: Array[String]): Unit = {

  }

  /**
    * 函数字面量在运行时创建的函数值对象被称为闭包，也就是这里的addmore
    */
  val addmore = (x:Int) => x+more

  /**
    * 不带自由变量的函数字面量被称为封闭项，在运行时创建的函数值对象严格上不被称为闭包
    */
  val add = (a:Int) => a+1
}
