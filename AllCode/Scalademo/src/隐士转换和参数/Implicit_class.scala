package 隐士转换和参数

/**
  * @Author:Alex_lei
  * @Description: 隐士类，下面的例子如果没有implicit修饰类Test，1是基本数据类型，而使用隐士转换，这样1就变成了Test类型
  */
object Implicit_class {

  implicit class Test(x:Int){
    def add(a:Int) = x + a
  }

  def main(args: Array[String]): Unit = {
    println(1.add(2))
  }
}


