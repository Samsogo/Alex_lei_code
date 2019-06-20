package Scala入门再探

/**
  * @Author:Alex_lei
  * @Description:
  */
object Simple_test {
  def main(args: Array[String]): Unit = {
    //1.使用类型参数化数组Array
    val arr = new Array[String](3)

    arr(0) = "Hello"
    arr(1) = ","
    arr(2) = "world!\n"

    for(s <- arr){
      print(s)
    }
    for(i <- 0 to 2){
      print(arr(i))
    }
    for(i <- 0 .to (2)){
      print(arr.apply(i))
    }
    arr.foreach(x=>print(x))

    println("----------------")
    //2.使用列表List
    val list1 = List(1,2,3)
    val list2 = List(4,5)

    val list12 = list1:::list2 //列表和列表的叠加
    println(list12)

    val list3 = 1::list1 //列表和数字的连接，list1调用::运算符
    println(list3)

    val filter_list = list1.filter(x => x>2)
    println(filter_list)

    println("-------------------")

    /**
      * List的函数还有很多
      * count()
      * drop()
      * exists()
      * foreach()
      * ....
      */

    //3.使用元组
    val pair = (99,"alex")
    println(pair)
    println(pair._1)
    println(pair._2)

    println("---------------")

    /**
      * 4.使用集set和映射map
      * set：可变set和不可变set
      * map：可变map和不可变map
      */
    //可变set
    var s = Set("alex","Bob")
    s += "Lily"
    println("可变set："+s)

    //不可变set
    import scala.collection.mutable.Set
    val s1 = Set("Alex","Lei")
    s1 += "Lily"
    println("不可变set："+s1)

    println("--------------")
    //可变map
    var m = Map[Int,String]()
    m += 1->"Alex"
    m += 2->"Bob"
    println(m)

    //不可变map
    import scala.collection.mutable.Map
    val m1 = Map[Int,String]()
    m1 += 1->"Alex"
    m1 += 2->"Lei"
    println(m1)

    //读取文件

    import scala.io.Source

    val bufferedsource = Source.fromFile("a.txt",enc = "utf8")

    val line = bufferedsource.getLines()
    for(l <- line){
      println(l)
    }
  }
}
