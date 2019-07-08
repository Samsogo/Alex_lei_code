package 控制抽象

/**
  * @Author:Alex_lei
  * @Description: 高阶函数，将函数作为函数传入
  */
object High_function {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4)
    println(getMax(l,g))

    /**
      * 返回的fun1是函数，可以继续根据fun1的参数列表进行调用
      */
    val fun1 = returnfunc(true,"Ai")
    println(fun1("alex","Bye"))
  }

  /**
    * 函数作为参数传入函数
    * @param l 列表
    * @param g 函数
    * @return
    */
  def getMax(l:List[Int] ,g:Int => Int) = {
    l.map(g)
  }

  def g(x:Int):Int = {
    x+1
  }

  /**
    * 返回函数
    * @param flag 布尔值
    * @param str 字符串
    * @return 函数(s1:String,s2:String) => s3:String
    */
  def returnfunc(flag:Boolean,str:String) :(String,String) => (String) = {
    var s = ""
    if(flag)
      s = "alex"
    else
      s = "Lily"
    (a:String,b:String) => str+" Hello world "+b

  }

}
