package 内建控制结构

import scala.util.control.Breaks._
/**
  * @Author:Alex_lei
  * @Description:
  */
object BC {
  def main(args: Array[String]): Unit = {
    /**
      * 这里说的是Java的break和continue，Scala中并没有这个用法
      * 使用变量标记实现
      */


    /**
      * 求前五个元素和,实现break用法
       */

    val arr = Array(1,2,3,4,5,6)
    var sum = 0
    breakable({
      for(i <- arr){
        if(i>5)
          break()
        sum += i
      }
    })
    println(sum)

    /**
      * 求前三个元素的和，实现continue
      */

    sum = 0
    for(i <- arr){
      breakable({
        if(i>3)
          break()
        sum += i
      })
    }
    println(sum)

    /**
      * 二者区别在于执行的循环体在breakable外还是内，二者都是使用break()函数
      */
  }
}
