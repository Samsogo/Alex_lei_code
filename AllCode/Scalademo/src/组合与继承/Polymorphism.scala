package 组合与继承

/**
  * @Author:Alex_lei
  * @Description: 多态和动态绑定
  */
object Polymorphism {
  def main(args: Array[String]): Unit = {
    /**
      * 多态就是多个子类可以继承同一个超类，以多种形式展示
      */

    val e1:Element = new ArrayElement(Array("Alex","Lei"))
    val e2:Element = new LineElement("ddddd")
    val e3:Element = new UniformElement('x',2,0)

    /**
      * 动态绑定指的是，被调用的实际方法实现取决于运行期对象基于的类
      * 这里使用demo函数测试
      */

    e1.demo  //I am ArrayElement
    e2.demo  //I am LineElement
    e3.demo  //I am UniformElement

    /**
      * 当希望一个成员不被继承的时候，我们可以使用final关键字进行修饰
      */

  }
}

class UniformElement(
  ch:Char,
  override val width:Int,
  override val height:Int) extends Element{
  private val line = ch.toString * width
  
  override def contents: Array[String] = Array(line)
  override def demo = println("I am UniformElement")
}