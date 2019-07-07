package 函数和闭包

/**
  * @Author:Alex_lei
  * @Description:
  */
object First_class_function {
  def main(args: Array[String]): Unit = {
    /**
      * 函数字面量:(x:Int,y:Int) => (x+y)，包括括号，参数列表，箭头和函数体
      */

    val res = add(1,2)
    println(res)

    val res1 = max(2,1)
    println(res1)

    /**
      * 函数字面量作为参数,每个元素调用一次该头等函数
      */

    val list = List(1,2,3,4,5)
    list.foreach((x:Int) => println(x))

    /**
      * 函数字面量的短格式
      */
    val newlist = list.filter(x => x>2)
    println(newlist)

    /**
      * 占位符语法
      */

    val newlist1 = list.filter(_ > 3)
    println(newlist1)

    /**
      * 部分应用函数，使用_代替参数列表
      */
    val a = sum(1,2,3)
    println(a)
    val b = sum _
    val t = b(2,3,4) //b.apply(2,3,4)一样
    println(t)

    val c = sum(1,_:Int ,2)
    val t1 = c(2)
    println(t1)


  }
  /**
    * 简单头等函数，函数体就一步
    */
  val add = (a:Int,b:Int) => (a+b)

  /**
    * 复杂头等函数，函数体包含多步
    */

  var max = (a:Int,b:Int) => {
    println("My ")
    println("name ")
    println("is ")
    println("alex")
    if(a>b)
      a
    else
      b
  }

  def sum(a:Int,b:Int,c:Int) = a + b + c

}
