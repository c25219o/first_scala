package jp.co.opst.hello_scala

/**
 * @author Yui
 * Scalaのmatch構文(Javaでいうswitch)の練習クラス
 */
object Practice02_match {

  def main(args: Array[String]) = {

    println("アルファベット検査")
    print("a～cのアルファベットを入力してください -->")
    val input = io.StdIn.readLine()

    input match {

      // breakは不要
      case "a" => print("a")
      case "b" => print("b")
      case "c" => print("c")

      // Javaのdefaultに相当
      case _ => print("不正な文字列")
    }

    println("が入力されました")

    println("------------------------------")

    println("データ型検査")
    print("整数か文字列を入力してください")

    val input2:Any = io.StdIn.readLine()

    input2 match {
      case i:Int => println(i + "は数字です")
      case s:String => println(s + "は文字列です")
      case d:Double => println(d + "は小数です")

      //なぜかこれを入れるとmainメソッドの書き方がおかしいといわれる...
//      case _ => (input2 + "は数字でも文字列でもないものです")
    }


  }

}