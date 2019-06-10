import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * @Author:Alex_lei
  * @Description: try catch finally用法，break和continue，match匹配用法，yield用法
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    println("try 语法")
    val n = 2
    val t =
      if (n % 2 == 0) {
        println(n)
      } else {
        throw new RuntimeException("wrong")
      }
    println(t)
    println("try 语法结束")
    val f = new FileReader("a.txt")
    try {
      val line = f.read()
      print(line)
    } catch {
      case ex: FileNotFoundException =>
      case e: IOException =>
    } finally {
      f.close()
    }

    val str = "hellod"

    //break隐含了，不会出现上一个执行完了，下一个还会执行
    str match {
      case "h" => println("h")
      case "he" => println("he")
      case "hel" => println("hel")
      case "hell" => println("hell")
      case _ => println("hello")
    }

    val animal = "dog"

    //match还可以返回值
    val eat =
      animal match {
        case "apple" => animal + " eat " + "apple"
        case "banana" => animal + " eat " + "banana"
        case "peek" => animal + " eat " + "peek"
        case "dog" => animal + " eat"
      }
    println(eat)

    //不在使用break和continue关键字,使用变量进行代替

    val l = List(2, 3, 4, 5, 6, 7, 8, 9, 10)

    var flag = true
    var i = 0
    var tmp = 0
    var ans = 0
    while (i <= 10 && flag) {
      tmp = l.apply(i)
      if (tmp % 2 == 0) {
        i += 1 //相当于continue
        println(tmp)
      } else {
        flag = false //相当于break
      }
    }

    val l1 = List(1, 2, 3, 4)
    val sum =
      for (i <- l1)
        yield cal(i)
    println(sum)
  }

  def cal(x: Int): Int = {
    return x + 1
  }
}

