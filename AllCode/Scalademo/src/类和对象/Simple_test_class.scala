package 类和对象

/**
  * @Author:Alex_lei
  * @Description:
  */
object Simple_test_class {
  def main(args: Array[String]): Unit = {
    val p1 = new People("alex",22,"beijing")
    val p2 = new People("Lily",12,"shanghai")
    val p3 = new People("alex",22,"beijing")

    println(p1.getName())
    println(p1)
    println(p1==p3)

  }
}

class People(name:String,age:Int,add:String){

  def getName(): String = {
    this.name
  }

  def getAge(): Int = {
    this.age
  }

  def getAdd(): String = {
    this.add
  }


  override def equals(obj: scala.Any): Boolean = {
    if(!obj.isInstanceOf[People])
      false
    else{
      val peo = obj.asInstanceOf[People]
      this.name == peo.getName()
    }
  }

  override def toString: String = "People={Name:"+this.name+",Age:"+this.age+",Add:"+this.add+"}"
}
