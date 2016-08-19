//import com.typesafe.config.Config
import slick.driver.PostgresDriver.api._
import slick.jdbc.JdbcBackend.Database

import scala.concurrent.ExecutionContext.Implicits.global
//import slick.driver.MySQLDriver.api._

object slickpostgresql {
class SP_AD(tag :Tag)extends Table[(Int, String, String, String)](tag, "sp_us"){
  def code = column[Int]("sp_us_code", O.PrimaryKey)
  def em = column[String]("sp_us_em", O.SqlType("VARCHAR(50)" ))
  def pw = column[String]("sp_us_pw", O.SqlType("VARCHAR(100)"))
  def nm = column[String]("sp_us_nm", O.SqlType("VARCHAR(100)"))

  def * = (code, em, pw, nm)
}

  val sp_ad = TableQuery[SP_AD]

  def main(args: Array[String]) {

    val db = Database.forConfig("database")
    try {
        db.run(sp_ad.result).map(_.foreach {
          case (code, em, pw, nm) => println(code + " -> " + em + " -> " + pw + " -> " + nm)
        })
    } finally db.close

    println("Hi, there!")
  }
}
