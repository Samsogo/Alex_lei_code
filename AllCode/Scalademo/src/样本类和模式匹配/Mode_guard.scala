package 样本类和模式匹配

/**
  * @Author:Alex_lei
  * @Description: 模式守卫，主要是为了更精确的匹配模式
  */
object Mode_guard {
  def main(args: Array[String]): Unit = {
    /**
      * 测试模式守卫
      */

    val a = -10
    print("a = -10 :")
    m(a)

    val b = 10
    print("b = 10 :")
    m(b)

    val s = "abc"
    print("s = abc :")
    m(s)

    val t = "a"
    print("t = a :")
    m(t)
  }

  def m(x:Any) = x match {
    case x:Int if x>0 => println("Int")
    case x:String if x.length>2 => println("String")
    case _ => println("Any")
  }
}
