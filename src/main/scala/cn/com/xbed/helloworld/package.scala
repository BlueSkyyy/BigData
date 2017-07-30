package cn.com.xbed

import cn.com.xbed.extend.{BMWCar, BYDCar}

/**
  * Created by root on 17-7-29.
  */
object MyCar {
  def main(args: Array[String]): Unit = {
    val myCar1 = new BMWCar
    val myCar2 = new BYDCar

    myCar1.greeting()
    myCar1.info()

    myCar2.greeting()
    myCar2.info()
  }
}
