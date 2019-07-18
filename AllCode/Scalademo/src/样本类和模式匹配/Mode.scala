package 样本类和模式匹配


import math.{E, Pi}
/**
  * @Author:Alex_lei
  * @Description: 几种模式的种类
  */
object Mode {
  case class people(name:String,age:Int)
  def main(args: Array[String]): Unit = {
    /**
      * 测试通配符
      */
    catch_all(3)
    println(describe(5))

    /**
      * 3.变量模式,在此例子中，pi是变量模式，所以它可以匹配任意值，所以后续的值不会匹配。
      */

    val pi = Pi
    val res = E match {
      case pi => "pi"
      case _ => "OK"
    }
    println(res)

    /**
      * 测试构造器模式
      */
    val p = people("alex",22)
    Constructor_mode(p)

    /**
      * 5.序列模式，匹配如List或Array这样的类型
      */
    val l = List(1,2,3)
    l match {
      case List(_,_,_) => println("list")
      case _ => println("something else")
    }

    /**
      * 6.元组模式
      */

    val t = (1,"alex",22)
    t match {
      case (_,_,_) => println("tuple")
      case _ => println("something else")
    }

    /**
      * 测试类型模式
      */
    val s = "alex"
    type_mode(s)
    val m = Map(1->'2',2->'3')
    type_mode(m)
  }

  /**
    * 1.通配符，符号：_ 可以匹配任何对象
    */
  def catch_all(a:Int): Unit = {
    a match {
      case 1 => println('a')
      case 2 => println('c')
      case _ => println('_')
    }

  }

  /**
    * 2.常量模式:用常量去匹配，基本类型的常量和val或单例对象也可以被用作常量。
    * @param x
    */
  def describe(x:Any) ={
    x match {
      case 5 => "five"
      case true => "truth"
      case "hello" => "hi"
      case Nil => "the empty list"
      case _=> "something else"
    }
  }

  /**
    * 4.构造器模式
    * @param p
    */
  def Constructor_mode(p:people) = {
    p match {
      case people(_,_) => println("people")
      case _ => println("any")
    }
  }

  /**
    * 7.类型模式
    * @param x
    */
  def type_mode(x:Any) = {
    x match {
      case s: String => println(s.length)
      case m: Map[_,_] => println(m.size)
      case _ => println("something else")
    }
  }
}