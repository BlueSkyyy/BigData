package cn.com.xbed.matchcase

/**
  * Created by root on 17-7-30.
  */
object GuardTest {
  def main(args: Array[String]): Unit = {
    /*for (elem <- List(1,2,3,4)){
      elem match {
        case _ if(elem %2 == 0) => println(elem + " is even.")
        case _ => println(elem + " is odd.")
      }
    }

    val university = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University","PKU"->"Peking University")
    for ((k,v) <- university) printf("Code is : %s and name is: %s\n",k,v)


    case class Car(brand: String, price: Int)
    val myBYDCar = new Car("BYD", 89000)
    val myBMWCar = new Car("BMW", 1200000)
    val myBenzCar = new Car("Benz", 1500000)
    for (car <- List(myBYDCar, myBMWCar, myBenzCar)) {
      car match{
        case Car("BYD", 89000) => println("Hello, BYD!")
        case Car("BMW", 1200000) => println("Hello, BMW!")
        case Car(brand, price) => println("Brand:"+ brand +", Price:"+price+", do you want it?")
      }
    }

    def plusStep(step: Int) = (num: Int) => num + step
    //给step赋值
    val myFunc = plusStep(3)
    //调用myFunc函数
    println(myFunc(0))
    println(myFunc(10)) */

    def sum(f: Int => Int, a: Int, b: Int): Int = {
      if(a > b) 0 else f(a) + sum(f, a+1, b)
    }

    def self(x: Int): Int = x
    def square(x: Int): Int = x * x
    def powerOfTwo(x: Int): Int = if(x == 0) 1 else 2 * powerOfTwo(x-1)

    def sumInts(a: Int, b: Int): Int = sum(self, a, b)
    def sumSquared(a: Int, b: Int): Int = sum(square, a, b)
    def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)
    println(sumInts(1,5))
    println(sumSquared(1,5))
    println(sumPowersOfTwo(1,5))
  }
}
