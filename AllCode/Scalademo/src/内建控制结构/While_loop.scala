package 内建控制结构

/**
  * @Author:Alex_lei
  * @Description:
  */
object While_loop {
  def main(args: Array[String]): Unit = {
    /**
      * while循环,do while循环和Java的用法一样
      */

    var i = 10
    var sum = 0
    while(i > 0){
      sum += i
      i -= 1
    }
    println(sum)

    i = 10
    sum = 0
    do{
      sum += i
      i -= 1
    }while(i>0)
    println(sum)
  }
}
