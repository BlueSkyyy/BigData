package cn.com.xbed.traitExample

/**
  * Created by root on 17-7-30.
  */
class BYDCarId extends CarId with CarGreeting{
  override var id: Int = 10000;
  override def currentId(): Int = {id += 1; id}
}

