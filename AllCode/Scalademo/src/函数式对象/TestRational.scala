package 函数式对象

/**
  * @Author:Alex_lei
  * @Description:
  */
object TestRational {
  def main(args: Array[String]): Unit = {
    /**
      *  当我们new一个新的Rational对象时，就会打印一次println(m+"/"+n)
      */
    val r1 = new Rational(1,2)
    val r2 = new Rational(3,4)
    /**
      *  测试add函数
      */
    val res1 = r1.add(r2)
    println("相加："+res1)

    /**
      * 测试*操作符
      */
    val res2 = r1 * r2
    val res3 = r1 .*(r2)
    println("相乘："+res2)

    /**
      * 测试重载方法
      */

    val res4 = r1 * 2
    println(res4)

    /**
      * 测试 2*r1是会出问题的，因为不能整数调用Rational的方法
      * 解决方法，将2转换为Rational对象，使用隐士转换
      */
    implicit def intTorational(i:Int) = new Rational(i)
    val res5 = 2 * r1
    println(res5)
  }
}
