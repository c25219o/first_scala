package jp.co.opst.hello_scala

import scala.io.StdIn

object Practice03_function {

  // remove 'A' and 'a' and return
//  def removeA(str:String) = str.replaceAll("a", "").replaceAll("A", "")

  // どのの書き方でもOK
  def testFunc1(str:String) = str.replaceAll("a", "").replaceAll("A", "")

//  val testFunc2 : (String) => String = (str:String)=> str.replaceAll("a", "").replaceAll("A", "")
  def testFunc2 : (String) => String = (str:String)=> str.replaceAll("a", "").replaceAll("A", "")

  val testFunc3 = (str:String) => str.replaceAll("a", "").replaceAll("A", "")
//  def testFunc3 = (str:String) => str.replaceAll("a", "").replaceAll("A", "")


  // これはエラー
//  val testFunc1(str:String) = str.replaceAll("a", "").replaceAll("A", "")


  def main (args:Array[String]) = {
    println("文字列を入力してください")
    print("--> ")
    val str:String = io.StdIn.readLine()

    println("\n入力した文字列からaとAを取り除きます")
    println("testFunc1--> " + testFunc1(str))
    println("testFunc2--> " + testFunc2(str))
    println("testFunc3--> " + testFunc3(str))

  }

}
