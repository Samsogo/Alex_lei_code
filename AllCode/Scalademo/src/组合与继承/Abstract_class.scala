package 组合与继承

/**
  * @Author:Alex_lei
  * @Description: 抽象类，类的继承和方法的重写及如何调用父类的构造器
  */
object Abstract_class {
  def main(args: Array[String]): Unit = {
    val ae = new ArrayElement(Array("Alex","Lei"))
    ae.contents
    println(ae.height)
    println(ae.width)

    val le = new LineElement("1234567")
    println(le.height)
    println(le.width)
  }
}

abstract class Element{
  /**
    * 无参数方法
    * @return
    */
  def contents:Array[String]
  val height:Int = contents.length
  val width:Int = if(height==0) 0 else contents(0).length

  def demo = println("I am Element")
}

class ArrayElement(conts:Array[String]) extends Element{
  /**
    * 无参数方法
    * 重写contents方法
    * @return
    */
  override def contents: Array[String] = conts

  override def demo = println("I am ArrayElement")
  /**
    * 可以将父类的方法变为字段，因为scala里的字段和方法属于相同的命名空间
    */
  //val contents: Array[String] = conts
}

/**
  * 调用超类的构造器，只要简单的把要传递的参数或参数列表放在超类名之后的括号里即可
  * @param s
  */
class LineElement(s:String) extends ArrayElement(Array(s)) {
  override val height: Int = 1
  override val width: Int = s.length

  override def demo = println("I am LineElement")
}