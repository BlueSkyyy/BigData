package cn.com.xbed.dataBase

import java.sql.{Connection, DriverManager}

/**
  * Created by root on 17-4-26.
  */
object DataBase {
  def main(args: Array[String]): Unit = {
    // 配置数据库连接参数
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/xbed_business"
    val username = "root"
    val password = "11567"

    var connection:Connection = null

    try {
      // 加载驱动类
      Class.forName(driver)
      // 创建数据库链接
      connection = DriverManager.getConnection(url, username, password)
      // 执行语句
      val resultSet = connection.createStatement().executeQuery("select * from orders where user_id = 1")
      // 处理查询结果
      while ( resultSet.next() ) {
        val name = resultSet.getString("name")
        val phone = resultSet.getString("phone")
        val orderNo = resultSet.getString("order_no")
        val createTime = resultSet.getString("created_at")
        println(String.format("姓名:%s, 手机:%s, 订单号:%s, 创建时间:%s", name, phone, orderNo, createTime));
      }
    } catch {
      case e => e.printStackTrace
    } finally {
      // 关闭数据库连接
      connection.close()
    }
  }
}
