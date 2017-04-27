package cn.com.xbed.io

import java.io.{File, FileInputStream, PrintWriter}

import scala.io.Source;

/**
 * Created by root on 17-4-26.
 */
object readLines {
  def main(args: Array[String]): Unit = {
//    readLine()
//    readSource()
//    readChar()
//    readFromUrl()
//    readBinery()
//    readBinery()
//    for (i <- subDirs(new File("src"))) println(i)
    systemControl()
  }

  def systemControl(): Unit ={
    import sys.process._
//    "ls -al  .." #| "grep A" !
    "ls -al  .." #>> new File("a.txt") !
  }

  def subDirs(dir:File): Iterator[File] ={
    val c = dir.listFiles.filter(_.isDirectory)
    c.toIterator ++ c.toIterator.flatMap(subDirs _)
  }

  def readBinery(): Unit ={
    val file = new File("term.sql")
    val in = new FileInputStream(file)
    val byte = new Array[Byte](file.length().toInt)
    in.read(byte)
    in.close()

    val out = new PrintWriter("term.sql")
    for(i <- 1 to 100) out.println(i)
    out.close()
  }

  def readFromUrl(): Unit ={
    val source1 = Source.fromURL("http://www.baidu.com", "UTF-8")
    val source2 = Source.fromString("HELLO WORLD")
    for (i <- source1){
      println(i)
    }
   }

  def readChar(): Unit ={
    val source = Source.fromFile("pom.xml", "UTF-8")
    val iter = source.buffered
    while (iter.hasNext){
      if(iter.head.equals("Y")){
        println(iter.next())
      }
    }
    source.close()
  }

  def readSource(): Unit ={
    val source = Source.fromFile("pom.xml", "UTF-8")
    val content = source.mkString
    println(content)
  }

  def readLine(): Unit ={
    val source = Source.fromFile("pom.xml", "UTF-8");
    val lines = source.getLines().toArray
    for( l <- lines){
      println(l)
    }
  }
}
