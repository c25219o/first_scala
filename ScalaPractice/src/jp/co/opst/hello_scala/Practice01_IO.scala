package jp.co.opst.hello_scala

import scala.util.control.Breaks.{break,breakable}


/**
 * @author Yui
 * 標準入力とループ途中でのbreak練習クラス
 */
object ScalaPractice01_IO {

  def main(args: Array[String]) = {

    println("単一行入力↓")
    val inputStr: String = io.StdIn.readLine()
    println("入力値 --> " + inputStr)
    println("------------------------------------")

    println("複数行入力↓");
    val lines = io.Source.stdin.getLines();
    var counter: Int = 0;

    // breakable ブロックでかこみ、
    // その中でbreakすると
    // breakable から抜け出せる
    breakable {

      for (line <- lines) {
        println("入力値 --> " + line);
        counter += 1
        if (counter == 3) {
          break
        }
      }

    }
    println("------------------------------------")

    println("java.util.Scannerを使用した入力")
    println("単一行入力↓")
    val scanner = new java.util.Scanner(System.in)

    // 5回ループ
    for(i <- 0 to 4) {
      println(scanner.next())
    }
    scanner.close()



  }
}