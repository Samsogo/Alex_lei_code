package 特质

/**
  * @Author:Alex_lei
  * @Description: 一个矩形的例子，使用特质
  */
object Trait_example {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(1,1)
    val p2 = new Point(3,4)

    val rect = new Rectangule(p1,p2)
    println(rect.left)
    println(rect.right)
    println(rect.width)
  }
}

class Rectangule(p1:Point,p2:Point) extends Rectangular {
  override def topLeft: Point = p1

  override def bottomRight: Point = p2
}

trait Rectangular{
  def topLeft:Point
  def bottomRight:Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right-left

}

class Point(val x:Int,val y:Int){

}