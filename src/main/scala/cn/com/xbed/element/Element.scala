package cn.com.xbed.element

/**
  * Created by root on 17-4-21.
  */
abstract class Element {
  def contents: Array[String]

  //定义成员方法
  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  //定义成员变量
  //  val height1 = contents.length
  //  val width1 = if(height == 0) 0 else contents(0).length

  def demo() {
    println("Element's implementation invoked")
  }


  def above(that: Element): Element =
    new ArrayElement(this.contents ++ this.contents)
//
//  def beside(that: Element): Element = {
//    val comtents = new Array[String](this.contents.length)
//    for(i<-0 until this.contents.length)
//      contents(i) = this.contents(i) + that.contents(i)
//    new ArrayElement(comtents)
//  }

  def beside(that:Element) : Element = {
    new ArrayElement(
      for(
        (line1,line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }

  override def toString = contents mkString "\n"
}
