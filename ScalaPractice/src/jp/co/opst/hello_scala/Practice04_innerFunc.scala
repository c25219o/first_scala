package jp.co.opst.hello_scala

object Practice04_innerFunc {

  // 文字列と引数2つを足された値が結合され、返ってくる
  def testFunc(str:String):(Int,Int) => String = (x:Int,y:Int) => str + (x + y)

  def main(args:Array[String]) = {
    print("input some string -->");
    val str:String = io.StdIn.readLine()

    println()
    println("input 2 numbers")
    print("1st --> ")
    val num1:Int = io.StdIn.readLine().toInt

    print("2nd --> ")
    val num2:Int = io.StdIn.readLine().toInt

    println(testFunc(str))

  }
}