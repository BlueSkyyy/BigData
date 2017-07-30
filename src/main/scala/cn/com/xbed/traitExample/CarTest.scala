package cn.com.xbed.traitExample

/**
  * Created by root on 17-7-30.
  */
object CarTest {
  def main(args: Array[String]): Unit = {
    val myCarId1 = new BYDCarId
    val myCarId2 = new BMWCarId
    printf("currentId1: %d.\n" , myCarId1.currentId());
    myCarId1.greeting("Welcome my first car.");
    printf("currentId2: %d.\n" , myCarId2.currentId());
    myCarId2.greeting("Welcome my second car.");
  }

}
