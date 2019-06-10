
/**
  * @Author:Alex_lei
  * @Description: 类和对象
  */

object Test{
  def main(args: Array[String]): Unit = {
    val a = new Rational(1,2)
    println(a)

    val b = new Rational(2,3)
    println(b)

    val c = a add b
    println(c)

    println(c.m)
    println(c.n)

    println(c.comp)

    val d = new Rational(4)
    println(d)

    val e = new Rational(66,42)
    println(e)

    val f = new Rational(2,3)
    val g = new Rational(3)
    val h = f + g
    println(h)

    val i = new Rational(2,3)
    val j = new Rational(3,4)
    println(i*j)

    val k = new Rational(2,3)
    val l = new Rational(3,4)
    val m = new Rational(4,5)
    println(k+l*m) //*的优先级比+高，所以先计算l*m，在计算+

    val n = new Rational(2,3)
    val o = new Rational(3)
    val p = n * o
    println(p)

    implicit def intToRational(i:Int):Rational = return new Rational(i)//隐士转换，将整形转换为Rational类型
    val q = new Rational(3,4)
    val r = 2
    println(r*q)

  }
}
//创建Rational类
class Rational(x: Int, y: Int){
  require(y!=0) // 检查先决条件

  def this(cnt:Int) = this(cnt,1) //辅助构造器，可以有多个，定义开始为def this(),
                                  // 被定义的构造器既可以是主构造器，也可以是其他构造器，因此主构造器才是类的唯一入口点

  private val g = gcd(x.abs,y.abs)

  var m = x/g //对外可见的，public，如果没有var或者val修饰词，则是对外不可见的，private
  var n = y/g

  def add(r:Rational):Rational = {
    return new Rational(m*r.n+r.m*n,n*r.n)
  }

  def + (r:Rational):Rational = {
    return new Rational(m*r.n+r.m*n,n*r.n)
  }

  def + (i:Int):Rational = {
    return new Rational(m+i*n,n)
  }

  def - (r:Rational):Rational = {
    return new Rational(m*r.n-r.m*n,n*r.n)
  }

  def - (i:Int):Rational = {
    return new Rational(m-i*n,n)
  }

  def * (r:Rational):Rational = {
    return new Rational(m*r.m,n*r.n)
  }

  def * (i:Int):Rational = {
    return new Rational(m*i,n)
  }

  def / (r:Rational):Rational = {
    return new Rational(m*r.n,n*r.m)
  }

  def / (i:Int):Rational = {
    return new Rational(m,n*i)
  }

  def comp:Int = {if(this.m>this.n) return 1 else 0} // this关键字是自指向，指向的是调用该方法的对象和java的一样

  override def toString = {
    if (n == 1) {
      m+""
    } else {
      m + "/" + n
    } //override修饰符是对原方法的冲载
  }

  //求两个数的最大公约数
  private def gcd(x:Int,y:Int):Int = {
    if(y==0)
      return x
    else{
      return gcd(y,x%y)
    }
  }
}