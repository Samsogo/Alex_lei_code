package 使用列表

/**
  * @Author:Alex_lei
  * @Description: 列表的基本操作
  */
object List_operation {
  def main(args: Array[String]): Unit = {
    val list:List[Int] = List(1,2,3,4)

    /**
      * 对于列表的所有操作都可以表达为以下三种形式
      * head
      * tail
      * isEmpty
      * head和tail不能作用于空列表，否则会出现异常
      */
    val head = list.head
    println(head) // 获取列表的第一个元素
    val tail = list.tail
    println(tail) // 获取除了第一个元素外的所有元素，并且为List类型
    val flag = list.isEmpty
    println(flag) // 判断列表是否为空

    /**
      * 常用的一些基本操作
      */
    val l1 = List(5,3,4,2)
    val l2 = List(3,4,5,6)

    val l3 = l1:::l2 //合并为新的列表
    println(l3)

    val l4 = l1.filter(x=>x>3)//过滤
    println(l4)

    val l5 = l1.sorted //从小到大排序
    println(l5)
    val l6 = l1.sortWith((a,b) => a>b) //从大到小
    println(l6)

    val c = l1.count(x => x>3) //计算大于3的个数
    println(c)

    val e = l1(2) // 通过索引获取列表值
    println(e)

    val dl = l1.drop(2) //删除头两个元素
    println(dl)

    val dr = l1.dropRight(2) //删除后两个元素
    println(dr)

    val el = l1.exists(_>2) //查看是否存在大于2的元素
    println(el)

    val fl = l1.forall(x => x>5) //判断所有的元素是否都大于5
    println(fl)

    val init_l = l1.init //剔除最后一个元素返回新的列表
    println(init_l)

    val ml = l1.map(s => {val s1 = s+" -1";s1.reverse})//修改列表的元素
    println(ml)

    val sl = l1.mkString(",") //生成以逗号分割的字符串
    println(sl)

    val sal = l1.splitAt(2) //在2的下标处进行分割，结果为两个列表
    println(sal)

    val index = l1.indices
    println(index)

    val zl = l1.zip(l2) //齿合列表
    println(zl)

    val toarr = l1.toArray //转换成列表
    toarr.foreach(println(_))

    val pl = l1.partition(x => x%2==0) //相当于两个filter，返回的是两个列表，一个为真的，一个为假的
    println(pl)

    /**
      * 折叠：分为左折叠，右折叠
      * 符号：/:,:\
      * 用法：z /: List[T](op),List[T] :\ z(op)
      */
    val foldleft_list = l1.foldLeft(1)(_+_) //
    println(foldleft_list)
    //与上面的等价
    val fll = (1/:l1)(_+_)
    println(fll)

    val foldright_list = l1.foldRight(1)(_*_)
    println(foldright_list)
    //与上面的等价
    val frl = (l1:\2)(_*_)
    println(frl)
  }
}
