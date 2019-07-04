package 基本类型和操作

/**
  * @Author:Alex_lei
  * @Description: 基本数据类型
  */
object BaseType {
  def main(args: Array[String]): Unit = {
    /**
      * 整数类型：Byte，Short，Int，Long，Char
      * 数类型：整数类型+Float+Double
      * Byte
      * Short
      * Int
      * Long
      * Char
      * String
      * Float
      * Double
      * Boolean
      * 除了String属于Java.lang包之外，其余所有类型都是scala的成员，如Int全名是Scala.Int。
      */
    val a:Byte = 12
    val b:Short = 14
    val c:Int = 12345
    val d:Long = 345678
    val e:Char = 'a'
    val f:String = "alex"
    val g:Float = 1.2f
    val h:Double = 1.4
    val i:Boolean = true
  }
}
