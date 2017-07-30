package cn.com.xbed.matchcase

/**
  * Created by root on 17-7-30.
  */
object MatchTest {
//  def main(args: Array[String]): Unit = {
//    val colorNum = 10
//    val colorStr = colorNum match {
//      case 1 => "red"
//      case 2 => "green"
//      case 3 => "yellow"
//      case 4 => "Not Allowed"
//      case unexpected => unexpected + " is not allowed"
//    }
//    println(colorStr)
//  }

  def main(args: Array[String]): Unit = {
    for (elem <- List(9,12.3,"Spark","Hadoop",'Hello)){
      val str = elem match {
        case i: Int => i + " is an int value.\n"
        case d: Double => d + " is a double value.\n"
        case "Spark"=> "Spark is found.\n"
        case s: String => s + " is a string value.\n"
        case _ => "This is an unexpected value.\n"      }
      print(str)
    }
  }
}
