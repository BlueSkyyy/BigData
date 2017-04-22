package cn.com.xbed.element

/**
  * Created by root on 17-4-22.
  */
class UniformElement (
  ch: Char,
  override val width:Int,
  override val height:Int
  )extends Element{
  private val line = ch.toString * width
  def contents = Array.fill(width)(line)
}
