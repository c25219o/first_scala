

package jp.co.opst.hello_scala

object HelloScala {
  def main (args:Array[String]) = {
    println("Hello Scala")

    val num1:Int = 10
    println(num1)

    val num2 = 20
    println(num2)

    val array1 = new Array[String](3)
    array1(0) = "Hello"
    println(array1)

    val list1 = List("Scala")
//    list1(0) = "Java" //immutable
    println(list1(0))

    val list2 = Nil
    val list3 = "Scala" :: list2
    val list4 = "Java" :: list3
    println(list4.length)

    val map = Map[String,Int]("Scala"->1, "Java"->2, "Ruby"->3);
    println(map("Scala"))
    println(map("Java"))
    println(map("Ruby"))

  }
}