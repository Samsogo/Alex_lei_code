package 使用列表

/**
  * @Author:Alex_lei
  * @Description: 列表的定义和构造
  */
object List_definition {
  def main(args: Array[String]): Unit = {
    /**
      * 1.
      * 列表和数组相似，但是列表是不可变的，不能改变列表的元素
      * 列表字面量
      */
    val fruit = List("apple","banana","pear")
    val nums = List(1,2,3)
    val l = List(List(1,2,3),List(2,3,4),List(3,4,5))

    /**
      * 2.
      * 列表是同质的，指的是列表所有的元素都具有相同的元素
      * 列表是协变的，指的是对于每一对类型S和T来说，如果S是T的子类，那么List[S]是List[T]的子类型
      */

    //同质
    val f = List("app","computer","babba")
    //协变,例如List[String]是List[Object]的子类型
    val l1:List[String] = f
    val l2:List[Object] = f

    //空列表的类型是List[Nothing],它是任何List[T]类型的子类

    val l3 = List()

    /**
      * 3.
      * 构造列表，所有的列表都是由两个基础构造块Nil和::构成的
      * Nil代表空列表，::中缀操作符
      */

    val ll = List(2,3,4)
    val lll = 2::3::4::Nil //顺序是从后往前
    //ll和lll是等价的
    println(ll==lll)
  }
}
