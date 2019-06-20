package Scala入门出探

/**
  * @Author:Alex_lei
  * @Description:
  */
object Simple_test {
  def main(args: Array[String]): Unit = {
    //1.val、var 变量声明
    val name = "alex"
    println("name:"+name)
    var age = 12
    println("first age:"+age)
    age = 15
    println("second age:"+age)

    println("----------------")
    //2. def 函数语法
    val max_value = max(3,2)

    println("max_value:"+max_value)

    println("----------")
    //3.while 循环
    var num = 5
    var sum = 0
    while(num>=0){
      sum += num
      num -= 1
    }
    println("sum:"+sum)

    println("---------")
    //4. foreach和for做枚举

    val arr = Array("My ","name ","is ","alex")

    arr.foreach(print)

    println
    for(s <- arr){
      print(s)
    }

  }

  def max(x:Int,y:Int): Int = {
    if(x>y)
      x
    else
      y
  }


}
