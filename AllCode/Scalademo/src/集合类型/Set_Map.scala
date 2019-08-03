package 集合类型


/**
  * @Author:Alex_lei
  * @Description:
  */
object Set_Map {
  def main(args: Array[String]): Unit = {
    /**
      * 在Scala 的集合中，有可变和不可变之分
      * 默认不导入包就是不可变的，即不能在对集合进行增加或删除元素
      * 导入包scala.collection.mutable.Set就是可变的集合，可以对set进行增添删除等，map也是一样
      */

    /**
      * 可变set　
      */
    var s = scala.collection.mutable.Set(2,3,4)
    s += 5
    println(s)
    println(s.head) //获取头元素
    s = s ++ List(1,2,3) //添加多个元素
    println(s)

    val s1 = scala.collection.mutable.Set(3,4,6)

    val s2 = s.intersect(s1) //获取交集
    println(s2)
    println(s2.toList)

    /**
      *  可变map
      */

    val m = scala.collection.mutable.Map.empty[Int,String]
    m(1) = "alex"
    m(2) = "Lily"
    m += (3->"Mike")
    println(m)
    println(m(1))
    println(m.keySet) //返回key的集合
    println(m.values) //返回value的集合
    m.toArray.foreach(println(_))

    /**
      * 可变集合和不可变集合的转换
      * map也是一样
      */
    val s11 = Set(1,2,4) //不可变集合

    val ms = scala.collection.mutable.Set.empty ++ s11
    println(ms)

  }
}
