import scala.io.Source

/**
  * @Author:Alex_lei
  * @Description: 函数和闭包
  */
object Test3 {
  def main(args: Array[String]): Unit = {
//    processfile("/Users/alex_lei/IdeaProject/Scalademo/src/a.txt",5)
//
//    cal(1,2,3)
//
//    val t = c(2)
//    println(t)
//
//    val r = cnt(10)
//    println(r)

//    遍历集合使用函数字面量
//    val l = List(1,2,3,4,5)
//    l.foreach((x:Int)=> println(x))

//    函数字面量的短格式，可以省略掉参数类型
//    println(l.filter(x => x>3))//返回List集合

//    占位符语法_
//    println(l.filter(_ > 2))
//    println(f(1,2))

//    部分应用函数,下划线代替整个参数列表
//    val l2 = List(3,4,5,6)
//    l2.foreach(println _)

//    val s = sum(1,2,3)
//    println(s)
//
//    val b = sum _
//    println(b(2,3,4))

//    val c = sum _  //偏函数,使用尾下划线
//    println(c.apply(1,2,3))

//    val d = sum(1,_:Int,4)
//    println(d.apply(2))



  }
  //函数字面量,如果想让函数字面量包含多条语句，可以用花括号包住函数体
  //头等函数
  var c = (x:Int) => x+1

  var cnt = (x:Int) => {
    print("We ")
    print("are ")
    println("family")
    x+1
  }

  val f = (_:Int) + (_:Int)

  def sum(a:Int,b:Int,c:Int) = a+b+c
  //处理文件函数
  def processfile(filename:String,width:Int){
    val source = Source.fromFile(filename)
    for(line <- source.getLines()){
      processline(filename,width,line)
    }
  }

  //处理文件每行的函数
  def processline(filename:String,width:Int,line:String){
    if(line.length>width){
      println(filename+":"+line.trim)
    }
  }

  //本地函数，可以在函数内定义函数，而且只作用于函数内部，内部函数可以直接使用外部函数的参数
   def cal(x:Int,y:Int,z:Int){
     def calcu(k:Int):Int ={
       val t = x*y
       val m = z*k
       return t*m
     }
     for(k <- 1 to 5){
       println(calcu(k))
     }
   }
}
