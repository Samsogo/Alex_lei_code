package 样本类和模式匹配

import java.util.function.BinaryOperator

/**
  * @Author:Alex_lei
  * @Description:
  */
object Case_class {

  /**
    * people就是样本类
    * @param name 名字属性
    * @param age 年龄属性
    */
  case class people(name:String,age:Int)
  def main(args: Array[String]): Unit = {
    val p1 = people("alex",23)
    val p2 = people("Lily",22)

    println(p1)

  }
}
