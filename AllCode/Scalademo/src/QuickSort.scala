/**
  * @Author:Alex_lei
  * @Description:
  */
object QuickSort {
  var a = List(10,9,8,7,6,5,4,3,2,11)
  var  arr = a.toArray
  def main(args: Array[String]): Unit = {
    quicksort(0,arr.length-1)
    arr.foreach(x=>print(x+" "))
  }

  def quicksort(left:Int,right:Int): Unit = {
    var i = left
    var j = right
    if(left>right){
      return
    }
    val key = arr.apply(left)

    while(i!=j){
      while(arr.apply(j)>=key&&i<j){
        j-=1
      }
      while(arr.apply(i)<=key&&i<j){
        i+=1
      }
      if(i<j){
        val  t = arr.apply(i)
        arr.update(i,arr.apply(j))
        arr.update(j,t)
      }
    }
    arr.update(left,arr.apply(i))
    arr.update(i,key)
    quicksort(left,i-1)
    quicksort(i+1,right)
  }

}
