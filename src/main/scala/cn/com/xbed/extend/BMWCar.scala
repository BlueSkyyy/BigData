package cn.com.xbed.extend

/**
  * Created by root on 17-7-29.
  */
class BMWCar extends Car{
  override val carBrand: String = "BMW"
  override def info(): Unit = {println("this is a BMWCar")}
  override def greeting(){println("welcome to my home")}
}

class BYDCar extends Car{
  override val carBrand: String = "BYD"
  override def info(): Unit = {println("this is a BYDCar")}
  override def greeting(){println("welcome to my home")}
}