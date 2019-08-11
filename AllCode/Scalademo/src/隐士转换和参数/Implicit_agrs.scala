package 隐士转换和参数

/**
  * @Author:Alex_lei
  * @Description: 下面的例子就是隐士参数的用法，可以看出test_implicit_arges这个函数的实现是有一个name参数的，
  *              但是调用的时候并没有给参数。
  */
object Implicit_agrs {
  def main(args: Array[String]): Unit = {
    implicit val name = "Alex"
    test_implicit_arges
  }
  def test_implicit_arges(implicit name:String) = println("I am " + name)
}
