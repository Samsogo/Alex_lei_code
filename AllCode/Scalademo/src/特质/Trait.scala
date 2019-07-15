package 特质

/**
  * @Author:Alex_lei
  * @Description:
  */
object Trait {
  def main(args: Array[String]): Unit = {
    val lbld = new Lbld
    lbld.f()

    val d:Dog = lbld
    d.f()

    val tt = new Test_trait
    tt.say
    tt.f()
  }
}

/**
  * 使用extends混入特质
  */
class Lbld extends Dog{

  override def f(): Unit = println("I am lbld")

}



/**
  * trait叫特质，是Scala里面代码复用的基础单元,没有类参数这个用法。
  * 通过混入的方式到类中
  * 类可以混入多个特质
  * 与Java的接口类似
  */
trait Dog{
  def f(): Unit ={
    println("I am dog")
  }
}

class Animal{
  val say = println("I am an animal")
}

/**
  * 需要继承某个父类，然后使用with关键字混入特质
  */
class Test_trait extends Animal with Dog{
  override val say: Unit = println("extends Animal")

  override def f(): Unit = println("with Dog")

}

/**
  * 使用extends和with分别是什么场景
  * 该类如果不扩展其它的类，那么就必须用extends
  * 如果想要扩展其它的类，就必须用with，可以混入多个特质，每个特质前面跟一个with关键字
  */
