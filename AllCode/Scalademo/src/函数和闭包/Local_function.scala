package 函数和闭包

/**
  * @Author:Alex_lei
  * @Description: 本地函数
  */
object Local_function {
  def main(args: Array[String]): Unit = {
    Outprocee(2,1)

    OutProcess(2,1)
  }

  def Outprocee(a:Int,b:Int): Unit = {
    val max_number = if (a>b) a else b
    Innerprocess(a,b,max_number)
  }

  def Innerprocess(a:Int,b:Int,c:Int): Unit ={
    if(a==c)
      println("a==c")
    else if(b==c)
      println("b==c")
  }

  def OutProcess(a:Int,b:Int): Unit ={
    val max_number = if (a>b) a else b
    InnerProcess(max_number)

    /**
      * InnerProcess就是本地函数，作用域为OutProcess函数内
      * @param c
      */
    def InnerProcess(c:Int): Unit ={
      if(a==c)
        println("a==c")
      else if(b==c)
        println("b==c")
    }
  }
}
