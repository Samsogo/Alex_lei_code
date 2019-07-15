package 特质

/**
  * @Author:Alex_lei
  * @Description: 当我们想对某几个对象进行排序时，并不需要定义四个比较运算符
  *              直接使用Ordered特质即可，混入Ordered特质，重写compare方法。
  */
object Orderd {
  def main(args: Array[String]): Unit = {
    val p1 = new People("alex",22,"beijing")
    val p2 = new People("Lily",21,"shanghai")
    val bool = p1>p2
    println(bool)
  }
}

class People(val name:String,val age:Int,val add:String) extends Ordered[People]{

  override def compare(that: People): Int = {
    this.name.compareTo(that.name)
  }
}
