package 内建控制结构

/**
  * @Author:Alex_lei
  * @Description:
  */
object For_expression {
  def main(args: Array[String]): Unit = {
    /**
      * Scala的for循环和Java的用法不一样
      */

    val list = Array(1,2,3,4,5)

    /**
      * 第一种,使用a to b，范围[a,b]，使用下标
      */
    for(i <- 0 to list.length-1){
      print(list.apply(i)+" ")
    }
    println()

    /**
      * 第二种,使用a until b，范围[a,b)，使用下标
      */

    for(i <- 0 until list.length){
      print(list(i)+" ")
    }
    println()

    /**
      * 第三种，直接遍历，不需要下标，i指向list的每个元素
      */
    for(i <- list){
      print(i+" ")
    }
    println()

    /**
      * for循环中使用多个过滤器
      */

    for(i <- list if i%2==0 if i>3){
      print(i+" ")
    }
    println()

    for(i <- list if check(i) ){
      print(i+" ")
    }
    println()

    /**
      * 构造新集合，使用yield语法
      */
    val t = for(i <- list if i>2) yield{
      val k = i * 2 + 10
      k
    }

    println(t.toList)

  }

  def check(a:Int): Boolean = if(a>2) true else false
}
