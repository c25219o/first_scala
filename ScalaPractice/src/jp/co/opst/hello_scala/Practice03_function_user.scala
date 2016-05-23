package jp.co.opst.hello_scala

object Practice03_function_user {

  def main(args:Array[String]) = {

    println("文字列を入力してください")
    print("--> ")
    val str:String = io.StdIn.readLine()

    println("\n入力した文字列からaとAを取り除きます")
    println("testFunc1--> " + Practice03_function.testFunc1(str))
    println("testFunc2--> " + Practice03_function.testFunc2(str))
    println("testFunc3--> " + Practice03_function.testFunc3(str))
  }

}