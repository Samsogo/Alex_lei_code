package 样本类和模式匹配



/**
  * @Author:Alex_lei
  * @Description: 封闭类，使用sealed关键字，用于模式匹配，当我们用
  *              样本类来做模式匹配时，想让编译器帮助我们确保列出了所有
  *              的可能，我们需要将样本类的超类进行封闭。
  */
object Sealed {
  def main(args: Array[String]): Unit = {

    val t = Number(2)
//    val res = describe(t)
//    println(res)
    desc(t)
  }

  /**
    * Warning:(16, 33) match may not be exhaustive.
    * It would fail on the following inputs: Binop(_, _, _), Unop(_, _)
    * def describe(x:Expr):String = x match {
    *
    * 这样写，会出现警告，说还有两种可能性
    *
    * 解决方式可以有以下两种，分别为des函数和desc函数
    * des函数主要是在加一个通配符
    * desc函数是在要匹配的表达式后面加一个@unchecked注解，功能是对于随后的模式的穷举性检查将被抑制掉
    */
  def describe(x:Expr):String = x match {
    case Number(_) => "a number"
    case Var(_) => "a string"
  }

  def des(x:Expr):String = x match {
    case Number(_) => "a number"
    case Var(_) => "a string"
    case _ => throw new RuntimeException
  }

  def desc(x:Expr):String = (x: @unchecked) match {
    case Number(_) => "a number"
    case Var(_) => "a string"
  }
}

/**
  * 定义封闭类Expr
  */
sealed abstract class Expr

/**
  * 定义四个样本类继承Expr
  *
  */
case class Var(name:String) extends Expr
case class Number(num:Double) extends Expr
case class Unop(operator:String,args:Expr) extends Expr
case class Binop(operator:String,left:Expr,right: Expr) extends Expr

