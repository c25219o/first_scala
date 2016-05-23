package jp.co.opst.hello_scala

import scala.util.control.Breaks.{break,breakable}


/**
 * 標準入力とループ途中でのbreak練習
 */
object ScalaPractice01 {

  def main(args: Array[String]) = {

    println("単一行入力↓")
    val inputStr: String = io.StdIn.readLine()
    println("入力値 --> " + inputStr)
    println("------------------------------------")

    println("複数行入力↓");
    val lines = io.Source.stdin.getLines();
    var counter: Int = 0;

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

  }
}