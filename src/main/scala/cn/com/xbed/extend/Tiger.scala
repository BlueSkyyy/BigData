package cn.com.xbed.extend

/**
  * Created by root on 17-4-22.
  */
//class Tiger (
//  override val dangerous: Boolean,
//  private var age: Int) extends Cat

class Tiger(param1 : Boolean, param2 : Int) extends Cat{
  override val dangerous: Boolean = param1
  private val age = param2
}