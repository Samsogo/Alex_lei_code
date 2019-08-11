package 隐士转换和参数

/**
  * @Author:Alex_lei
  * @Description: 所谓隐式转换函数指的是以implicit关键字申明的带有单个参数的函数。
  *              下面的例子就是通过隐士转换函数将Fish类型转换为Monkey类型
  */
object Implicit_function {
  implicit def change(f:Fish) = new Monkey
  def main(args: Array[String]): Unit = {
    val f = new Fish
    println(f.say)
  }
}

class Fish{
  def getName = "Fruit"
}

class Monkey{
  def say = "I am monkey"
}