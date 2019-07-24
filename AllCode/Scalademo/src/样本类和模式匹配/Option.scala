package 样本类和模式匹配

/**
  * @Author:Alex_lei
  * @Description: option类型的值只有两种形式，可以是Some(x)，其中x是实际值，也可以None对象
  *               Some和None都是它的子类，都是使用final修饰，不能再有派生子类
  */
object Option {
  def main(args: Array[String]): Unit = {
    val book = Map("Hadoop" -> 10,"Spark" -> 20,"Flink" -> 30,"Scala" -> 40)

    val t = book.get("Hadoop") //Option[Int] = Some(10)返回值是Option[Int]类型
    println(t)

    /**
      * 下面两个例子说明，当有返回值的时候，结果不会返回getOrElse的参数
      * 当没有返回值的时候，结果就会返回getOrElse的参数
      */
    val t1 = book.get("Hbase").getOrElse("No key") //No key
    println(t1)

    val t2 = book.get("Spark").getOrElse("yes") //20
    println(t2)
  }
}
