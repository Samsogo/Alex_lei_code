package 函数和闭包

/**
  * @Author:Alex_lei
  * @Description: 重复参数
  */
object Repeat_parameter {
  def main(args: Array[String]): Unit = {
    echo("a","b","c")
    val arr = Array("alex","Lily","Bob")

    /**
      * 当传入一个数组的时候，需要在参数后面加一个: _*
      */
    echo(arr: _*)
  }

  /**
    * 在变量类型后面加工*，指参数列表是可变的
    * @param a
    */
  def echo(a:String*) = {
    for(i <- a){
      println(i)
    }
  }
}
