name := "slick-postgresql"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.zaxxer" % "HikariCP" % "2.4.3",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.1.1",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)

