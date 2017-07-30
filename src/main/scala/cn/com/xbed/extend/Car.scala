package cn.com.xbed.extend

/**
  * Created by root on 17-7-29.
  */
abstract class Car {
  val carBrand: String
  def info()
  def greeting(): Unit ={
    println("welcome to my car!")
  }
}
