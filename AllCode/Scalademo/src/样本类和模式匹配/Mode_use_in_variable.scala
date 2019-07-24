package 样本类和模式匹配

/**
  * @Author:Alex_lei
  * @Description: 使用模式替代简单的标识符
  */
object Mode_use_in_variable {
  def main(args: Array[String]): Unit = {
    val t = (123,"Hello")

    val (num,string) = t
    println((num,string))

  }
}

