package cn.com.xbed.traitExample

/**
  * Created by root on 17-7-30.
  */
class BMWCarId extends CarId with CarGreeting{
  override var id: Int = 20000;
  override def currentId(): Int = {id+=1; id}
}
