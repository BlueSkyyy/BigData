package cn.com.xbed.element.elementobj

import cn.com.xbed.element.Element
import cn.com.xbed.element.ArrayElement
import cn.com.xbed.element.UniformElement
import cn.com.xbed.element.LineElement

/**
  * Created by root on 17-4-23.
  */
object Element {
//  private class ArrayElement(val contents : Array[String])
//    extends Element{}
//
//  private class LineElement(s : String)
//    extends ArrayElement(Array(s)){
//    override def width: Int = s.length
//    override def height: Int = 1
//  }
//
//  private class UniformElement(ch : Char, override val width : Int, override val height: Int)
//    extends Element{
//    private val line = ch.toString * width
//    def contents = Array.fill(height)(line)
//  }

  def elem(contents : Array[String]):Element =
    new ArrayElement(contents)
  def elem(char : Char, width : Int, height : Int) =
    new UniformElement(char, width, height)
  def elem(line : String) : Element =
    new LineElement(line)
}
