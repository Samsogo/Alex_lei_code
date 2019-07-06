package 内建控制结构

/**
  * @Author:Alex_lei
  * @Description:
  */
object If_expression {
  def main(args: Array[String]): Unit = {
    /**
      * Scala的if表达式和Java的一样用法
      */

    val a = readInt()
    if(a > 0){
      println(a+" > 0")
    }else if(a < 0){
      println(a+" < 0")
    }else{
      println(a+" = 0")
    }
  }
}
