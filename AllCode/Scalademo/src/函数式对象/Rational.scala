package 函数式对象

/**
  * @Author:Alex_lei
  * @Description: 在这里写一个有理数的类,包括有理数的计算，进行类的说明
  */
class Rational(m:Int,n:Int) { //m,n指的是类参数，是Java不支持的

  /**
    * 检查先决条件，使用require函数，参数为布尔类型,require(b:boolean)
    * 如果参数为假，则报 java.lang.IllegalArgumentException，阻止对象被构造
    * 如果参数为真，则正常返回
    * 例如：这里的有理数的分母不能为0
    */
  require(n!=0)

  private val g = gcd(m,n)


  /**
    * 添加字段，获取类参数的值,并且约分
    */
  val numerator:Int = m/g
  val denominator:Int = n/g

  /**
    * 辅助构造器，主构造器之外的都是辅助构造器
    * 这里的意思是分母为1的直接写分子
    */

  def this(m:Int) = this(m,1)

  /**
    * scala编译器把类内部的任何不是字段也不是方法定义的代码编译至主构造器中
    */
  //println("Rational:("+m+"/"+n+")")

  /**
    * 两个有理数相加,当参数为类对象的时候，我们需要将类参数赋值给字段
    */
  def add(r:Rational): Rational = {
    /**
      * 直接使用r去获取m和n的值是会报错的，需要添加字段去获取
      */
    val numerator = this.numerator * r.denominator + this.denominator * r.numerator
    val denominator = this.denominator * r.denominator
    val newRational = new Rational(numerator,denominator)
    newRational
  }

  /**
    *
    * @param r Rational对象
    * @return Rational对象
    * 定义*操作符
    */
  def * (r:Rational): Rational = {
    val numerator = this.numerator * r.numerator
    val denominator = this.denominator * r.denominator
    val newRational = new Rational(numerator,denominator)
    newRational
  }

  /**
    * 重载上个方法
    * @param i 要乘的整数
    * @return Rational对象
    */
  def *(i:Int): Rational = {
    val numerator = this.numerator * i
    val newRational = new Rational(numerator,denominator)
    newRational
  }
  /**
    * 重写toString方法，使用override关键字
    * @return :Unit  返回为空
    */
  override def toString = "Rational("+numerator+","+denominator+")"

  /**
    *
    * @param a 分子
    * @param b 分母
    * @return 最大公约数
    */
  private def gcd(a:Int,b:Int): Int = {
    if(b==0)
      a
    else
      gcd(b,a%b)
  }
}



