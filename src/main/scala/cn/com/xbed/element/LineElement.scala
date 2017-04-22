package cn.com.xbed.element

/**
  * Created by root on 17-4-22.
  */
class LineElement(s:String)extends ArrayElement(Array(s)){
  override def width: Int = s.length
  override def height: Int = 1

  override def demo(): Unit = {
      println("LineElement's implementation invoked")
  }
}
