package cn.com.xbed.element

/**
  * Created by root on 17-4-21.
  */
//class ArrayElement(conts: Array[String]) extends Element{
//  override def contents: Array[String] = conts
//  val contents1: Array[String] = conts
//}

//class ArrayElement(val contents :Array[String]) extends Element {}
class ArrayElement(val x :Array[String]) extends Element{val contents: Array[String] = x

  override def demo(): Unit = {
    println("ArrayElement's implementation invoked")
  }
}