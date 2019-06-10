
/**
  * @Author:Alex_lei
  * @Description: 内建控制结构
  */

object Test1 {
  def main(args: Array[String]): Unit = {
    var f = "a.txt"
    if(true){
      f = "b.txt"
    }
    else{
      f = "c.txt"
    }
    val k = if(true) "b.txt" else "c.txt"
    print(k)

    val fileheres = new java.io.File(".").listFiles()
    for(file <- fileheres){ //file <- fileheres 是一种被称为发生器的语法
      println(file)
    }

    for(i <- 1 to 4){// 1至4全部包括
      println(i)
    }

    for(i <- 1 until 4){//不包括上边界4
      println(i)
    }

    for(i <- 1 to 10 if i%2==0;if i>5){//过滤某个子集
      println(i)
    }

    //arr是一个集合，通过yield关键字
    val arr = for(f <- fileheres if f.getName.startsWith("."))
      yield f

    for(i <- arr)
      println(i)

  }
}