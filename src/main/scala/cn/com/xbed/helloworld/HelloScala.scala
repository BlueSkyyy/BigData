package cn.com.xbed.helloworld

import java.io._

import cn.com.xbed.element.{ArrayElement, Element, LineElement, UniformElement}

import scala.collection.immutable.Nil
import scala.io.Source

/**
  * Created by root on 17-4-12.
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
//            greet();
//            loop(;
//            loop("scala");
//            loop(Array(1,2,3,4,5));
//            array()
//            array1()
//            list()
//            list1()
//            list2()
//            turples()
//            set()
//            map()
//            file()
//            file1()
//            file2()
//            file3()
//            file4()
//            file5()
//            exception(2)
//            exception2()
//            match1(Array(4))
//        break()
//        withPrintWriter(new File("pom.xml"), writer => writer.println(new java.util.Date))
//        withPrintWriter1(new File("pom.xml"))(writer => println(new java.util.Date))
//    assert(() => 5>3)
//    assert1(5<6)
//    val element = new ArrayElement(Array("hello","world"))
//    println(element.height)
//    println(element.width)
//    //测试继承多态
//    val e1 : Element = new ArrayElement(Array("hello","world"))
//    val e2 : ArrayElement = new LineElement("hello")
//    val e3 : Element = e2
//    val e4 : Element = new UniformElement('a',2,3)

    invokeDemo(new ArrayElement(Array("hello")))
    invokeDemo(new LineElement("Helllo"))
    invokeDemo(new UniformElement('a',23,3))
  }

  def invokeDemo(e:Element): Unit ={
    e.demo()
  }

  def assert1(predicate: => Boolean) =
    if(!predicate) throw new AssertionError

  def assert(predicate : () => Boolean) =
    if(!predicate()) throw new AssertionError

  def withPrintWriter1(file:File)(op: PrintWriter => Unit): Unit ={
    val writer=new PrintWriter(file)
    try{
      op(writer)
    }finally{
      writer.close()
    }
  }

  def withPrintWriter (file: File, op: PrintWriter => Unit) {
    val writer=new PrintWriter(file)
    try{
      op(writer)
    }finally{
      writer.close()
    }
  }

  def break(): Unit = {
    val in = new BufferedReader(new InputStreamReader(System.in))
    while (true) {
      println("? ")
      if (in.readLine() == "") break
    }
  }

  def match1(arr: Array[Int]) {
    val a = if (arr.length > 0) arr(0) else ""
    a match {
      case 1 => print("一")
      case 2 => print("二")
      case 3 => print("三")
      case _ => print("something else")
    }
  }

  def exception2(): Unit = {
    try {
      val f = new FileReader("pom.xml")
      print(f)
    } catch {
      case ex: FileNotFoundException => println("FileNotFoundException")
      case ex: IllegalArgumentException => println("IllegalArgumentException")
      case ex: IndexOutOfBoundsException => println("IndexOutOfBoundsException")
    } finally {
      print("执行完毕了")
    }
  }

  def exception(i: Int): Unit = {
    if (i % 2 == 0) println(i / 2) else throw new RuntimeException("n is a odd")
  }

  def file5(): Unit = {
    val files = (new File(".")).listFiles
    val a = for (file <- files if file.getName.contains(".")) yield file
    for (b <- a) println(b.getName)
  }

  def file4() = {
    val files = (new File(".")).listFiles

    def fileLines(file: File) = Source.fromFile(file).getLines().toList

    def grep(pattern: String): Unit = {
      for {
        file <- files
        if file.getName.endsWith(".xml")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      } println(file + ":" + trimmed)
    }

    grep(".*artifactId.*")
  }


  def file3() = {
    val files = (new File(".")).listFiles

    def fileLines(file: File) = Source.fromFile(file).getLines().toList

    def grep(pattern: String): Unit = {
      for {
        file <- files
        if file.getName.endsWith(".xml")
        line <- fileLines(file)
        if line.trim.matches(pattern)
      } println(file + ":" + line.trim)
    }

    grep(".*artifactId.*")
  }

  def file2() = {
    val files = (new File(".")).listFiles

    def fileLines(file: File) = Source.fromFile(file).getLines().toList

    def grep(pattern: String): Unit = {
      for (
        file <- files
        if file.getName.endsWith(".xml");
        line <- fileLines(file)
        if line.trim.matches(pattern)
      ) println(file + ":" + line.trim)
    }

    grep(".*artifactId.*")
  }

  def file1(): Unit = {
    val files = (new File(".")).listFiles
    for (file <- files if file.isFile if file.getName.endsWith(".xml")) println(file)
  }

  def file(): Unit = {
    val files = (new File(".")).listFiles()
    for (file <- files)
      println(file)
  }

  def map(): Unit = {
    val romanNumeral = Map(1 -> "I", 2 -> "II",
      3 -> "III", 4 -> "IV", 5 -> "V")
    println(romanNumeral(4))
  }

  def set(): Unit = {
    var jetSet = Set("hadoop", "spark", "storm")
    jetSet += "kafka"
    println(jetSet.contains("hive"))
  }

  def turples(): Unit = {
    val pair = (12, "hadoop", 'd', 10.00)
    println(pair._1)
    println(pair._2)
    println(pair._3)
    println(pair._4)
  }

  def list2(): Unit = {
    val abc = Nil.::(3).::(2).::(1)
    println(abc)
  }

  def list1(): Unit = {
    val abc = 1 :: 2 :: 3 :: Nil
    println(abc)
  }

  def list(): Unit = {
    val a = List(1, 2)
    val b = List(3, 4)
    val ab = a ::: b
    println(a + " and " + b)
    println(ab)
  }

  def array1(): Unit = {
    val greetStrings = Array("hadoop", "spark", "scala");
    for (n <- 0 to 2) {
      println(greetStrings.apply(n))
      //      println(greetStrings(n))
    }
  }

  def array(): Unit = {
    val greetStrings = new Array[String](3);
    greetStrings(0) = "hadoop"
    greetStrings(1) = "spark"
    greetStrings(2) = "storm"
    for (n <- 0 to 2) {
      println(greetStrings.apply(n))
      //      println(greetStrings(n))
    }
  }

  def loop(args: Array[Int]) = {
    for (arg <- args) {
      println(arg)
    }
    //    args.foreach(println)
    //    args.foreach(println(_))
    //    args.foreach(arg => println(arg))
  }

  def greet() = println("hello world")

  def loop() = {
    var i = 0;
    while (i <= 5) {
      println(i)
      i += 1
    }
  }

  def loop(args: String) = {
    var i = 0;
    while (i <= 5) {
      println(args)
      i += 1
    }
  }

}
