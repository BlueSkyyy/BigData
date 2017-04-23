package cn.com.xbed.traitTest

/**
  * Created by root on 17-4-23.
  */
trait Rectangular {
  def topLeft:Point
  def bottomRight:Point
  def left =topLeft.x
  def right =bottomRight.x
  def width=right-left
}
