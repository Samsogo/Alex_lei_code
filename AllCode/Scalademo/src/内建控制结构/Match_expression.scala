package 内建控制结构

/**
  * @Author:Alex_lei
  * @Description:
  */
object Match_expression {
  def main(args: Array[String]): Unit = {
    /**
      * Scala的match语法类似于Java的switch语法
      */

    /**
      * 正常匹配，然后打印结果
      */
    val name = "alex"
    name match {
      case "Lei" => println("Name is Lei")
      case "alex" => println("Name is alex")
      case "Lily" => println("Name is Lily")
      case _ => println("Other")
    }

    /**
      * 匹配选择，有返回值，而且匹配成功之后不会继续往下匹配
      */
    val fri = "Lily"
    val t = fri match {
      case "Alex" => "A"
      case "Lily" => "L1"
      case "Bob" => "B"
      case "Lily" => "L2"
    }
    println(t)
  }
}
