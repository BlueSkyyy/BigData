package cn.com.xbed.element

import elementobj.Element
import elementobj.Element.elem


/**
  * Created by root on 17-4-21.
  */
//abstract class Element {
//  def contents: Array[String]
//
//  //定义成员方法
//  def height: Int = contents.length
//
//  def width: Int = if (height == 0) 0 else contents(0).length
//
//  //定义成员变量
//  //  val height1 = contents.length
//  //  val width1 = if(height == 0) 0 else contents(0).length
//
//  def demo() {
//    println("Element's implementation invoked")
//  }
//
//
//  def above(that: Element): Element =
//    new ArrayElement(this.contents ++ this.contents)
////
////  def beside(that: Element): Element = {
////    val comtents = new Array[String](this.contents.length)
////    for(i<-0 until this.contents.length)
////      contents(i) = this.contents(i) + that.contents(i)
////    new ArrayElement(comtents)
////  }
//
//  def beside(that:Element) : Element = {
//    new ArrayElement(
//      for(
//        (line1,line2) <- this.contents zip that.contents
//      ) yield line1 + line2
//    )
//  }
//
//  override def toString = contents mkString "\n"
//}

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int =  contents(0).length
  def above(that: Element) :Element = {
    val this1=this widen that.width
    val that1=that widen this.width
    elem (this1.contents ++ that1.contents)
  }
  def beside(that: Element) :Element = {
    val this1=this heighten that.height
    val that1=that heighten this.height
    Element.elem(
      for(
        (line1,line2) <- this1.contents zip that1.contents
      ) yield line1+line2
    )
  }
  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = Element.elem(' ', (w - width) / 2, height)
      var right = Element.elem(' ', w - width - left.width, height)
      left beside this beside right
    }
  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = Element.elem(' ', width, (h - height) / 2)
      var bot = Element.elem(' ', width, h - height - top.height)
      top above this above bot
    }
  override def toString = contents mkString "\n"
}