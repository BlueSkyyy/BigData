package cn.com.xbed.dataBase

import java.sql.{Connection, DriverManager}

/**
  * Created by root on 17-4-26.
  */
object DataBase {
  def main(args: Array[String]): Unit = {
    // connect to the database named "mysql" on the localhost
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/xbed_business"
    val username = "root"
    val password = "11567"

    var connection:Connection = null

    try {

      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select * from orders where user_id = 1")
      while ( resultSet.next() ) {
        val name = resultSet.getString("name")
        val phone = resultSet.getString("phone")
        val orderNo = resultSet.getString("order_no")
        println("name, phone, orderNo = " + name + ", " + phone + ", " + orderNo)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }
}
